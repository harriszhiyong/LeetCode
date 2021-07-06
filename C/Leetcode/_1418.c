//
// Created by 张智勇 on 2021/7/6.
//

#define TABLE_MAX 501

// 升序 比较函数
int cmp_up(const void *a, const void *b)
{
    return strcmp(*(char **)a, *(char **)b);
}

// 在原地删除重复出现的元素，不要使用额外的数组空间，保留先出现的
int removeDuplicates(char **nums, int numsSize)
{
    int i, j = 1;

    if (nums == NULL || numsSize == 0) {
        return 0;
    }

    for (i = 1; i < numsSize; i++) {
        if (strcmp(nums[i], nums[i - 1]) != 0) {
            nums[j] = nums[i];
            j++;
        }
    }

    return j;
}

char ***displayTable(char ***orders, int ordersSize, int *ordersColSize, int *returnSize, int **returnColumnSizes)
{
    int i, j;
    int food_size;
    char **food = NULL;
    int **table = NULL;
    int flag[TABLE_MAX];
    int cnt = 0;

    food = (char **)malloc(sizeof(char *) * ordersSize);
    if (food == NULL) {
        return NULL;
    }
    memset(food, 0, sizeof(char *) * ordersSize);
    for (i = 0; i < ordersSize; i++) {
        food[i] = malloc(sizeof(char) * 21);
        if (food[i] == NULL) {
            return NULL;
        }
        memset(food[i], 0 , sizeof(char) * 21);
    }

    for (i = 0; i < ordersSize; i++) {
        strcpy(food[i], orders[i][2]);
    }
    qsort(food, ordersSize, sizeof(char *), cmp_up);
    food_size = removeDuplicates(food, ordersSize);

    table = (int **)malloc(TABLE_MAX * sizeof(int *));
    if (table == NULL) {
        return NULL;
    }
    for (i = 0; i < TABLE_MAX; i++) {
        table[i] = (int *)malloc(food_size * sizeof(int));
        if (table[i] == NULL) {
            return NULL;
        }
        memset(table[i], 0, food_size * sizeof(int));
    }
    memset(flag, 0, sizeof(int) * TABLE_MAX);
    for (i = 0; i < ordersSize; i++) {
        flag[atoi(orders[i][1])]++;
        for (j = 0; j < food_size; j++) {
            if (strcmp(orders[i][2], food[j]) == 0) {
                break;
            }
        }
        table[atoi(orders[i][1])][j]++;
    }

    for (i = 0; i < TABLE_MAX; i++) {
        if (flag[i] != 0) {
            cnt++;
        }
    }

    *returnSize = cnt + 1;
    int *arr = (int *)malloc((cnt + 1) * sizeof(int));
    for (i = 0; i < cnt + 1; i++) {
        arr[i] = food_size + 1;
    }
    *returnColumnSizes = arr;

    char ***result = NULL;
    result = (char ***)malloc((cnt + 1) * sizeof(char **));
    if (result == NULL) {
        return NULL;
    }
    memset(result, 0, (cnt + 1) * sizeof(char **));
    for (i = 0; i < (cnt + 1); i++) {
        result[i] = (char **)malloc((food_size + 1) * sizeof(char *));
        if (result[i] == NULL) {
            return NULL;
        }
        memset(result[i], 0, (food_size + 1) * sizeof(char *));
    }
    for (i = 0; i < cnt + 1; i++) {
        for (j = 0; j < food_size + 1; j++) {
            result[i][j] = (char *)malloc(sizeof(char) * 21);
            if (result[i][j] == NULL) {
                return NULL;
            }
            memset(result[i][j], 0, sizeof(char) * 21);
        }
    }

    strcpy(result[0][0], "Table");
    for (i = 0; i < food_size; i++) {
        strcpy(result[0][i + 1], food[i]);
    }

    j = 1;
    char temp[21];
    for (i = 0; i < TABLE_MAX; i++) {
        if (flag[i] != 0) {
            memset(temp, 0, sizeof(char) * 21);
            sprintf(temp, "%d", i);
            //puts(temp);
            strcpy(result[j][0], temp);

            for (int k = 0; k < food_size; k++) {
                memset(temp, 0, sizeof(char) * 21);
                sprintf(temp, "%d", table[i][k]);
                //puts(temp);
                strcpy(result[j][k + 1], temp);
            }
            j++;
        }
    }

    return result;
}
