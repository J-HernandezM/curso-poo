class EjercicioN12 {
    public static void main(String[] args) {
        int hours = 48;
        int incomePerHour = 5000;

        int grossIncome = hours * incomePerHour;
        double tax = grossIncome * (12.5 / 100);
        double netIncome = grossIncome - tax;

        System.out.println("Salario bruto: " + grossIncome);
        System.out.println("Retencion en la fuente: " + tax);
        System.out.println("Salario neto: " + netIncome);

    }
}