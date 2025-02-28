package az.developia.spring_projekt_2sentyabr.entity;

public class Book {
		private int id;
		private String name;
		private double price;
		private int pageCount;
		
		public Book(int id, String name, double price, int pageCount) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.pageCount = pageCount;
		}

		public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }
		
		public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public int getPageCount() {
	        return pageCount;
	    }

	    public void setPageCount(int pageCount) {
	        this.pageCount = pageCount;
	    }
	    
	    @Override
	    public String toString() {
	        return "Book [id=" + id + ", name=" + name + ", price=" + price + ", pageCount=" + pageCount + "]";
	    }
	}
