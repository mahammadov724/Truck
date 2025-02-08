package az.developia.librarian;

import java.time.LocalDateTime;

import az.developia.librarian.entity.LibrarianGroupEntity;
import az.developia.librarian.entity.Librarianentity;
import az.developia.librarian.entity.Librarianentity;
import az.developia.librarian.exception.MyRuntimeException;
import az.developia.librarian.repository.LibrarianGroupRepository;
import az.developia.librarian.repository.librarianrepository;
import az.developia.librarian.repository.librarianrepository;

public class librarianmain {
public static void main(String[] args) {
	
	Librarianentity librarian=new Librarianentity
			(0, "neriman", "Mehemmedov", "070", "Qarayev", "Neriman3553", "sd2idj34Jf93");
	
	librarianrepository repo=new librarianrepository();
	
	LibrarianGroupEntity librarianGroupEntity=new LibrarianGroupEntity(null, "a3", LocalDateTime.now(), 6);
	
	LibrarianGroupRepository groupRepo=new LibrarianGroupRepository();
	groupRepo.deleteGroup(3);
	System.out.println(groupRepo.getAllLibrarianGroup(6));
	
	
	try {
		String username=librarian.getUsername();
		String password=librarian.getPassword();
		
		if (repo.login(username, password)) {
			System.out.println("Login oldun");
		}else {
			System.out.println("Istifadeci adi ve ya parol yalnisdir!");
		}
		
		if (repo.checkUser(librarian.getUsername())) {
			System.out.println("Bu istifadeci artiq movcuddur");
		}
		else {
			repo.add(librarian);
		}
		
	} catch (MyRuntimeException e) {
		System.out.println(e.getMyMessage());
	}
	
	
	//yeni ders
	librarianrepository repo1 = new librarianrepository();

    int librarianId = 1; 
    Librarianentity librarian1 = repo1.getById(librarianId);

    if (librarian1 != null) {
        System.out.println("Kitabxanaçı Məlumatları: ");
        System.out.println(librarian1.toString());
    } else {
        System.out.println("Bu ID-yə uyğun kitabxanaçı tapılmadı.");
    }
    
    
}
}
