public class emp {
        public String EmpName;
        public long EmpID;
        public int Age;
        public double salary;

        public void displayeemployeename(){
            System.out.println(EmpName);
        }
        public void EmpName(long emp_id,String emp_name){
            System.out.println(String.format("Employee Id :%d and Employee Name: %s", emp_id, emp_name));
        }


        public static void main(String[] args) {
            System.out.println("Hello, this is an employee portal!");
            emp emp_obj1 = new emp();
            emp_obj1.EmpID = 1234;
            emp_obj1.EmpName = "Basana";
            emp_obj1.Age = 24;
            emp_obj1.salary = 1200;


            emp_obj1.EmpName(emp_obj1.EmpID, emp_obj1.EmpName);
            emp_obj1.displayeemployeename();


    }

}
