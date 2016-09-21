package org.apache.jackrabbit.oak.util;

import org.apache.jackrabbit.oak.api.PropertyState;
import org.apache.jackrabbit.oak.api.Tree;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import javax.jcr.RepositoryException;
import java.util.Collection;

public interface AutoCreateHandler {
    Collection<String> getProperties();

    Collection<String> getNodes();

    PropertyState autoCreateProperty(@Nonnull String name, @Nonnull Tree definition, @CheckForNull String userID);

    Tree addChild(@Nonnull Tree parent, @Nonnull String name, @CheckForNull String typeName, @Nonnull Tree typeRoot,
                  @CheckForNull String userID) throws RepositoryException;

}
