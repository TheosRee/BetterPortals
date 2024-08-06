package com.lauriethefish.betterportals.bukkit.nms;

import com.lauriethefish.betterportals.shared.util.ReflectionUtil;
import org.bukkit.Bukkit;

/**
 * Bukkit is strange and puts the version number in the NMS package names.
 * This means that we have to use reflection to access them if we want to work across versions.
 */
public class CraftBukkitClassUtil {
    private static final String craftBukkitClassPrefix = Bukkit.getServer().getClass().getPackage().getName() + ".";

    /**
     * Finds a class in the <code>org.bukkit.craftbukkit.version</code> package
     * @param name Name of the class relative to this package, with no dot at the start.
     * @return The located class
     */
    public static Class<?> findCraftBukkitClass(String name) {
        return ReflectionUtil.findClass(craftBukkitClassPrefix + name);
    }
}
