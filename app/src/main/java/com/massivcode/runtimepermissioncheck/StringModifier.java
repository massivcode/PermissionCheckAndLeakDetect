package com.massivcode.runtimepermissioncheck;

/**
 * Created by massivcode@gmail.com on 2017. 3. 21. 10:18
 */

public class StringModifier {
    private String string;

    public StringModifier(String string) {
        this.string = string;
    }

    /**
     * 해당 문자열에 줄바꿈을 적용한다.
     */
    public StringModifier newLine() {
        string += "\n";
        return this;
    }

    /**
     * 해당 문자열에 텍스트를 추가한다.
     */
    public StringModifier addText(CharSequence addedText) {
        string += addedText;
        return this;
    }

    /**
     * 해당 문자열에 trim 을 한다.
     */
    public StringModifier trim() {
        string = string.trim();
        return this;
    }

    /**
     * 최종적으로 모든 값이 적용된 문자열을 리턴한다.
     */
    public String end() {
        return string;
    }
}
