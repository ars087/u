
public class PhysicalPerson extends Client {


    @Override
    public void bankСonditions() {
        System.out.println("Счет физического лица.\n" +
                "Комиссия за пополнение отсутствует.\n " +
                "Комиссия за списание средств отсутствует.");
        getAmount();

    }
}
