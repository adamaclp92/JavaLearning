package Animal;

//Az a különbség az abstract között és az interface között, hogy az abstractot akkor érdemes használni, ha örököltetni akarunk, interface-nél nem
//pl Nem csak a madár tud repülni, hanem mondjuk a denevér is, ezért kell egy CanFly interface, és azt implementálni a Bird-ökre stb

//interfacenek lehetnek változói, de csak public static final
//nem lehetnek construktorai, az abstractnak igen
//az interface methódusai alapból publikusak


public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
