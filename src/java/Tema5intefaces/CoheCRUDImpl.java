package java.Tema5intefaces;

public class CoheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Save()");
        
    }

    @Override
    public void findAll() {
        System.out.println("findAll()");
        
    }

    @Override
    public void delete() {
        System.out.println("delete()");
        
    }
    
    
}
