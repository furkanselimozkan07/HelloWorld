public class HelloWorld {
    public static void main(String[] args) {
        int sum = 0; // Toplamı tutacak değişken
        boolean hasValidInput = false; // Geçerli giriş olup olmadığını kontrol etmek için bayrak

        // Komut satırı argümanları üzerinde döngü
        for (String arg : args) {
            try {
                // Her argümanı tam sayıya çevir ve toplamaya ekle
                sum += Integer.parseInt(arg);
                hasValidInput = true; // Geçerli bir girdi olduğunu işaretle
            } catch (NumberFormatException e) {
                // Geçersiz girdi için hata mesajı yazdır
                System.out.println("Geçersiz girdi: '" + arg + "' geçerli bir tam sayı değildir.");
            }
        }

        // Sonucu yalnızca geçerli giriş varsa göster
        if (hasValidInput) {
            System.out.println("Toplam: " + sum);
        } else {
            System.out.println("Hiç geçerli bir tam sayı sağlanmadı.");
        }
    }
}