class AgeExceptionDemo {
    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        }
        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}