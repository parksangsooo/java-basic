package algorithm;

import java.util.ArrayDeque;
import java.util.Queue;
/*
변수(dx 및 dy): 이러한 배열은 그리드 내에서 인접한 셀로의 이동을 지시하여 알고리즘이 가능한 네 가지 방향을 탐색할 수 있도록 도와줍니다.
bfs 방법: 이 방법은 대기열을 사용하여 너비 우선 검색을 구현합니다. 초기 지점부터 시작하여 수준별로 탐색하고, 방문한 것으로 표시하고, 직접 이웃을 대기열에 추가합니다. 가능한 모든 경로가 탐색될 때까지 다음 레벨의 이웃으로 계속됩니다.
queue: 큐(FIFO 구조)는 다음에 방문할 노드를 관리합니다. 검색된 순서대로 노드를 방문하여 계층별 탐색을 용이하게 합니다.
visited: 이 배열은 재방문을 방지하고 알고리즘이 효율적으로 진행되도록 보장하기 위해 이미 탐색된 노드를 추적합니다.
grid: '1'이 통과 가능하고 '0'이 장애물인 탐색 중인 지도나 영역을 나타냅니다.
 */

public class BFSExample {

    // 방향 벡터: 위, 아래, 왼쪽, 오른쪽 탐색에 사용
    private static final int[] dx = {-1, 1, 0, 0}; // dx 배열은 행의 이동을 나타냄
    private static final int[] dy = {0, 0, -1, 1}; // dy 배열은 열의 이동을 나타냄

    // BFS 알고리즘을 큐를 사용해 구현하는 메소드
    public static void bfs(int x, int y, boolean[][] visited, int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>(); // 큐 초기화, 탐색할 위치를 저장
        queue.add(new int[]{x, y}); // 시작 위치를 큐에 추가
        visited[x][y] = true; // 시작 위치 방문 처리

        while (!queue.isEmpty()) { // 큐가 비어있지 않은 동안 반복
            int[] current = queue.poll(); // 큐에서 하나의 위치를 꺼냄
            x = current[0]; // 현재 x 좌표
            y = current[1]; // 현재 y 좌표
            System.out.println("방문 위치: (" + x + ", " + y + ")"); // 방문한 위치 출력

            // 현재 위치에서 4방향 탐색
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d]; // 다음 x 좌표 계산
                int ny = y + dy[d]; // 다음 y 좌표 계산

                // 배열 범위를 벗어나지 않고, 방문하지 않았으며, 탐색 가능한 위치(1)인 경우
                if (0 <= nx && nx < grid.length && 0 <= ny && ny < grid[0].length && !visited[nx][ny] && grid[nx][ny] == 1) {
                    queue.add(new int[]{nx, ny}); // 큐에 다음 위치 추가
                    visited[nx][ny] = true; // 다음 위치를 방문 처리
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = { // 2차원 배열 그리드: 1은 탐색 가능, 0은 탐색 불가
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 1},
        };

        boolean[][] visited = new boolean[grid.length][grid[0].length]; // 방문한 위치를 기록하는 배열

        // 예제로, (0, 0)에서 탐색 시작
        bfs(0, 0, visited, grid);
    }
}
