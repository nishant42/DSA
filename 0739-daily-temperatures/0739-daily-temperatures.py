class Solution:
    def dailyTemperatures(self, temperatures: list[int]) -> list[int]:
        tracker = []
        res = [0] * len(temperatures)

        for i, j in enumerate(temperatures):
            # today (j) answers every waiting day that's colder
            while tracker and temperatures[tracker[-1]] < j:
                k = tracker.pop()
                res[k] = i - k
            tracker.append(i)    # today now waits for its own warmer day

        return res