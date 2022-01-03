package net.tydiumcraft.colortranslatorapi;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;

public interface translateColorsUtil {
    TextDecoration getFormat(char code);

    TextDecoration getColor(char code);

    Component translateFormatWithColor(String string, NamedTextColor color);

    Component translateColorWithFormat(String string, TextDecoration format);

    Component translateFormat(String string);

    Component translateColor(String string);

    Component translateStringList(String[] strings);
}
