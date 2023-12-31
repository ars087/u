import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {


    public ArrayList<Employee> employeeAll = new ArrayList<>();


    private double incomeCompany;
    int numberOfdays;


    Company(int numberOfdays) {
        generatingIncome(numberOfdays);
        this.numberOfdays = numberOfdays;

    }

    public void setIncomeCompany(double incomeCompany) {
        this.incomeCompany = incomeCompany;


    }

    public int getSizeAllEmployee() {
        return employeeAll.size();
    }


//    public double getIncomeCompany() {
//
//        return incomeCompany;
//    }


    public void generatingIncome(int numberOfdays) {

        if (numberOfdays > 0) {

            for (int i = 0; i < numberOfdays; i++) {
                incomeCompany += 50000 + (int) (Math.random() * 25000);


            }
        } else {
            System.out.println("Укажите верное  количество дней работы компании");
        }
    }


    public void printArrayList() {
        for (Employee arrayList1 : employeeAll) {

            System.out.println(arrayList1.getMonthSalary());
        }

    }


    public double getIncomeCompany() {

        int profit = 0;
        for (Employee employee : employeeAll) {

            if (employee instanceof Manager) {

                profit += ((Manager) employee).getProfitForCompany();

            }

        }


        return incomeCompany += profit;
    }


    public void fire(int count) {

        if (count <= employeeAll.size() && count > 0) {
            int i = employeeAll.size();
            int size = i;

            for (; size < i + count; i--) {


                employeeAll.remove(i - 1);

            }

        } else {
            System.out.println(" Количество удаляемых объектов больше чем добавленных в списке. Измените пероваемое значение");
        }

    }


    public void hire(Employee employee) {


        employeeAll.add(employee);


    }


    public void hireALL(ArrayList<Employee> employee) {

        employeeAll.addAll(employee);

    }


    public List<Employee> getTopSalaryStaff(int count) {


        employeeAll.sort(Comparator.comparingDouble(Employee::getMonthSalary));


        List<Employee> clonedList = null;
        if (employeeAll.size() >= count) {

            clonedList = employeeAll.subList(0, count);

        } else {
            System.out.println("Указанная величина превышет размер имеющегося списка");
        }

        return clonedList;

    }


    public List<Employee> getLowestSalaryStaff(int count) {


        Comparator<Employee> comparator = (e1, e2) -> (int) (e1.getMonthSalary() - e2.getMonthSalary());
        employeeAll.sort(comparator.reversed());

        //      List <Employee>test = (List<Employee>) employeeAll.stream()

        // filter(employee -> employee.   =count)
        //.distinct()


        List<Employee> clonedList = null;
        if (employeeAll.size() >= count) {

            clonedList = employeeAll.subList(0, count);

        } else {
            System.out.println("Указанная величина превышет размер имеющегося списка");
        }

        return clonedList;

    }


}

