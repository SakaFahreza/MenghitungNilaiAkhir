import java.util.Scanner;
public class Na{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int nilaiTugas, kuis, uts, uas;
		float nilaiAkhir ;

		System.out.println("Menghitung Nilai Akhir Mahasiswa");

		System.out.print("Inputkan Nilai Tugas : ");
		nilaiTugas = keyboard.nextInt();

		System.out.print("Inputkan kuis : ");
		kuis = keyboard.nextInt();

		System.out.print("Inputkan uts : ");
		uts = keyboard.nextInt();

		System.out.print("Inputkan uas : ");
		uas = keyboard.nextInt();

		nilaiAkhir = 15% nilaiTugas+15% kuis+30% uts+40% uas;

		System.out.print("Nilai Akhir Adalah : ");
		System.out.print(" Tugas "+" + "+" Kuis "+" + "+" Uts "+" + "+" Uas "+" = "+nilaiAkhir);
		








	}
}