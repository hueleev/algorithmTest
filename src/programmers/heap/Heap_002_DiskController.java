package programmers.heap;

import java.util.*;

public class Heap_002_DiskController {
    public static void main(String[] args) {

        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        solution(jobs);
    }

    public static int solution(int[][] jobs) {
        // 대기열 → '작업이 요청되는 시점'이 빠른 순으로 정렬되는 우선순위 큐
        PriorityQueue<Job> q = new PriorityQueue(new Comparator<Job>() {
            @Override
            public int compare(Job j1, Job j2){
                return j1.reqTime - j2.reqTime;
            }
        });
        for(int[] job : jobs){
            q.offer(new Job(job[0],job[1]));
        }

        // 작업 큐 → '작업이 소요시간'이 적은 순으로 정렬되는 우선순위 큐
        PriorityQueue<Job> pq = new PriorityQueue(new Comparator<Job>() {
            @Override
            public int compare(Job j1, Job j2){
                return j1.runTime - j2.runTime;
            }
        });

        int count = 0;
        int sum = 0;
        int time = 0;
        // 모든 작업이 끝날때까지 while문 반복
        while(count < jobs.length){
            // 1ms마다 while문 반복
            // 작업 큐에 추가 (대기열이 비어있지 않고 요청 시점이 되었을 때 추가)
            while(!q.isEmpty() && time >= q.peek().reqTime){
                pq.offer(q.poll());
            }
            // 작업 큐에 작업이 있으면 우선순위에 따라 작업 진행
            if(!pq.isEmpty()){
                Job j = pq.poll();
                sum += j.runTime + (time - j.reqTime);
                time += j.runTime;
                count++;
            }
            else {  // 작업이 없으면 시간 1ms 흐름
                time++;
            }
        }
        // 작업의 요청부터 종료까지 걸린 시간의 평균 리턴
        return sum / count;
    }
}

class Job {
    int reqTime;
    int runTime;

    public Job(int req, int run){
        this.reqTime = req;
        this.runTime = run;
    }
}