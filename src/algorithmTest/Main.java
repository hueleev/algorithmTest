package algorithmTest;


import lecture.inflearn_java.loader.BeanFactory;

public class Main {;

    public static void main(String[] args) {
        BeanFactory ins1 = BeanFactory.getInstance();
        BeanFactory ins2 = BeanFactory.getInstance();

        if (ins1 == ins2) {
            System.out.println("true");
        }
        /*Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N+1];

        for (int i=2; i<=N; i++) {
            // i-1 연산에 +1
            dp[i] = dp[i-1] + 1;
            if (i%2 == 0) {
                // 위 계산한 i연산 이거나 혹은 /2 연산 중 최소값
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            }
            if (i%3 == 0) {
                // 위 계산한 i연산 이거나 혹은 /3 연산 중 최소값
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
            }
        }

        System.out.println(dp[N]);*/
    }
/*
    private static int[][] solution(int servers, boolean sticky, int[] requests) {
        int[][] answer = new int[servers][servers];
        int chk = 0;
        int chk2 = 0;

        Queue<Integer> queue = new LinkedList<>();
        if (sticky) {
            Arrays.sort(requests);
        }
        for (int request : requests) {
            queue.add(request);
        }

        if (!sticky) {

            while(!queue.isEmpty()) {
                if (chk != servers) {
                    answer[chk][chk2] = queue.poll();
                } else {
                    chk2++;
                    chk = 0;
                    answer[0][chk2] = queue.poll();
                }
                chk++;
            }
        }
        return answer;
    }*/
}