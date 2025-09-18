import java.util.*;

class TaskManager {
    // taskId -> [userId, priority]
    private Map<Integer, int[]> taskInfo;
    // Max-heap: sort by priority desc, then taskId desc
    private PriorityQueue<int[]> pq;

    public TaskManager(List<List<Integer>> tasks) {
        taskInfo = new HashMap<>();
        pq = new PriorityQueue<>((a, b) -> {
            if (b[0] != a[0]) return b[0] - a[0]; // higher priority first
            return b[1] - a[1]; // if tie, higher taskId first
        });

        for (List<Integer> t : tasks) {
            int userId = t.get(0), taskId = t.get(1), priority = t.get(2);
            taskInfo.put(taskId, new int[]{userId, priority});
            pq.offer(new int[]{priority, taskId});
        }
    }

    public void add(int userId, int taskId, int priority) {
        taskInfo.put(taskId, new int[]{userId, priority});
        pq.offer(new int[]{priority, taskId});
    }

    public void edit(int taskId, int newPriority) {
        int[] info = taskInfo.get(taskId);
        info[1] = newPriority;
        pq.offer(new int[]{newPriority, taskId}); // push updated task
    }

    public void rmv(int taskId) {
        taskInfo.remove(taskId); // lazy removal
    }

    public int execTop() {
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int priority = top[0], taskId = top[1];
            if (taskInfo.containsKey(taskId) && taskInfo.get(taskId)[1] == priority) {
                int userId = taskInfo.get(taskId)[0];
                taskInfo.remove(taskId);
                return userId;
            }
        }
        return -1; // no tasks left
    }
}
