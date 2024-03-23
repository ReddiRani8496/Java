class FirstBadVersion {
    int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        while(start < end) {
            int mid = start-(end-start)/2;

            if(isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        if(start == end && isBadVersion(start)) {
            return start;
        }
        return -1;
    }
}