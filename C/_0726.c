//
// Created by 张智勇 on 2021/7/4.
//


bool isUpperCase(char ch) {
    return (ch >= 'A' && ch <= 'Z');
}

bool isLowerCase(char ch) {
    return (ch >= 'a' && ch <= 'z');
}

bool isDigit(char ch) {
    return (ch >= '0' && ch <= '9');
}

//堆栈元素结构，左括号只存在Name[0]中，便于边界判断
struct SElemType {
    int index;
    int count;
    char Name[3];
};


char *countOfAtoms(char *formula) {
    char *retArr = (char *) malloc(10000);
    int len;
    int i;
    int num;
    int count[3000] = {0};  //Mg=100*('M'-'A')+'g'-'a' + 1, 大写字母放在高两位
    struct SElemType tmpStack[5000];
    int top = 0;
    struct SElemType tmpElem;
    int index;

    //1. 处理字符串
    for (i = 0; formula[i] != '\0'; i++) {
        if (formula[i] == '(') {
            tmpStack[top++].Name[0] = '(';
            tmpStack[top].Name[1] = '\0';
        } else if (isUpperCase(formula[i])) {
            tmpStack[top].Name[0] = formula[i];
            index = (formula[i] - 'A') * 100;

            i++;
            if (isLowerCase(formula[i])) {
                tmpStack[top].Name[1] = formula[i];
                index += formula[i] - 'a' + 1;
                i++;
                tmpStack[top].Name[2] = '\0';
            } else
                tmpStack[top].Name[1] = '\0';

            tmpStack[top].index = index;

            num = 0;
            while (isDigit(formula[i])) {
                num = 10 * num + formula[i] - '0';
                i++;
            }
            i--; //往回退一个字符位置
            if (!num)
                num = 1;

            tmpStack[top].count = num;
            top++;
        } else if (formula[i] == ')') {

            int num = 0;
            i++;
            while (isDigit(formula[i])) {
                num = 10 * num + formula[i] - '0';
                i++;
            }
            if (!num)
                num = 1;

            struct SElemType tmpS[1000]; //再用一个堆栈将括号内的元素倒出来
            int len = 0;
            while (top && tmpStack[--top].Name[0] != '(') //更新括号内的元素计数值
            {
                tmpElem = tmpStack[top];
                tmpElem.count *= num;
                tmpS[len++] = tmpElem;

            }

            while (len) //将辅助栈的内容再倒回原来的堆栈
            {
                tmpStack[top++] = tmpS[--len];
            }

            i--; //往回退一个字符
        }

    }

    // 2. 更新堆栈中所有元素的计数值，并存入哈希表中

    while (top) {
        tmpElem = tmpStack[--top];
        if (tmpElem.Name[0] != '(')
            count[tmpElem.index] += tmpElem.count;
    }

    //按字典序输出哈希表中的元素计数值
    len = 0;
    char tmpS[10];
    for (i = 0; i < 3000; i++) {
        if (count[i]) {
            retArr[len++] = i / 100 + 'A';
            if (i % 100)
                retArr[len++] = i % 100 - 1 + 'a';
            retArr[len] = '\0';
            if (count[i] > 1) {
                sprintf(tmpS, "%d", count[i]);
                strcat(retArr, tmpS);
                len += strlen(tmpS);
            }
            retArr[len] = '\0';
        }
    }
    return retArr;

}
