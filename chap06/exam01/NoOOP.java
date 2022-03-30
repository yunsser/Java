package exam01;

public class NoOOP {
	public static void main(String[] args) {
		int HongKilDong_Quiz1 = 85; int HongKilDong_MidTerm = 80;
		int HongKilDong_Quiz2 = 90; int HongKilDong_FinalTerm = 95;
		
		int KangKamChan_Quiz1 = 75; int KangKamChan_MidTerm = 60;
		int KangKamChan_Quiz2 = 80; int KangKamChan_FinalTerm = 100;		
		
		int LeeSunSin_Quiz1 = 95; int LeeSunSin_MidTerm = 90;
		int LeeSunSin_Quiz2 = 85; int LeeSunSin_FinalTerm = 80;
		
		int YoukanSun_Quiz1 = 75; int YoukanSun_MidTerm = 90;
		int YoukanSun_Quiz2 = 95; int YoukanSun_FinalTerm = 100;		
		
		int AnJungKun_Quiz1 = 85; int AnJungKun_MidTerm = 85;
		int AnJungKun_Quiz2 = 80; int AnJungKun_FinalTerm = 80;		
		
		int hongKilDong_Sum = Sum(HongKilDong_Quiz1, HongKilDong_MidTerm, HongKilDong_Quiz2, HongKilDong_FinalTerm);
		int KangKamChan_Sum = Sum(KangKamChan_Quiz1, KangKamChan_MidTerm, KangKamChan_Quiz2, KangKamChan_FinalTerm);
		int LeeSunSin_Sum = Sum(LeeSunSin_Quiz1, LeeSunSin_MidTerm, LeeSunSin_Quiz2, LeeSunSin_FinalTerm);
		int YoukanSun_Sum = Sum(YoukanSun_Quiz1, YoukanSun_MidTerm, YoukanSun_Quiz2, YoukanSun_FinalTerm);
		int AnJungKun_Sum = Sum(AnJungKun_Quiz1, AnJungKun_MidTerm, AnJungKun_Quiz2, AnJungKun_FinalTerm);
		
		int hongKilDong_Avg = average(hongKilDong_Sum);
		int KangKamChan_Ayg = average(KangKamChan_Sum);
		int LeeSunSin_Avg = average(LeeSunSin_Sum);
		int YoukanSun_Avg = average(YoukanSun_Sum);
		int AnJungKun_Avg = average(AnJungKun_Sum);
		
		
	}
	
	public static int Sum(int n1, int n2, int n3, int n4) {
		return n1 + n2 + n3 + n4;
	}
	
	public static int average(int s) {
		return s / 4;
	}
	
}
