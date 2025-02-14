package me.hyperbone.faygo;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class DependencyBuilder {

    private static final List<Dependency> dependencies = new ArrayList<>();

    public @NotNull DependencyBuilder addDependency(Dependency dependency) {
        dependencies.add(dependency);
        return this;
    }

    public void loadDependencies() {
        dependencies.forEach(Dependency::downloadAndLoad);
    }
}