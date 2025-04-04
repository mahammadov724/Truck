package az.developia.spring_proyekt_2setyabr.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_projekt_2sentyabr.entity.Reader;
import az.developia.spring_projekt_2sentyabr.repository.ReaderRepository;

@RestController
@RequestMapping("/readers")
public class ReaderController {
	@Autowired
    private ReaderRepository readerRepository;

    @PostMapping
    public Reader createReader(@RequestBody Reader reader) {
        return readerRepository.save(reader);
    }

    @GetMapping("/{id}")
    public Optional<Reader> getReader(@PathVariable Long id) {
        return readerRepository.findById(id);
    }

    @GetMapping
    public List<Reader> getAllReaders() {
        return readerRepository.findAll();
    }

    @PutMapping("/{id}")
    public Reader updateReader(@PathVariable Long id, @RequestBody Reader reader) {
        if (readerRepository.existsById(id)) {
            reader.setId(id);
            return readerRepository.save(reader);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteReader(@PathVariable Long id) {
        readerRepository.deleteById(id);
    }
}
