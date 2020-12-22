class Problem {
    public static void main(String[] args) {
        String mode = "default";
        for (int i = 0; i < args.length; i++) {
            if ("mode".equals(args[i]) && args.length > i + 1) {
                mode = args[i + 1];
                break;
            }
        }
        System.out.println(mode);
    }
}