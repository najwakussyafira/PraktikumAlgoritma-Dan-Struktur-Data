package Praktikum5;

public class DivideAndConquer14 {
    public static int findMaxUTS(Mahasiswa14[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int leftMax = findMaxUTS(mhs, l, mid);
        int rightMax = findMaxUTS(mhs, mid + 1, r);
        return Math.max(leftMax, rightMax);
    }
    public static int findMinUTS(Mahasiswa14[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int leftMin = findMinUTS(mhs, l, mid);
        int rightMin = findMinUTS(mhs, mid + 1, r);
        return Math.min(leftMin, rightMin);
    }
}

