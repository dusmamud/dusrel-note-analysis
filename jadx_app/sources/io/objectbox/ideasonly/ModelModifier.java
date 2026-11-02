package io.objectbox.ideasonly;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/* JADX INFO: loaded from: classes2.dex */
public class ModelModifier {

    public class EntityModifier {
        final String name;
        final String schemaName;

        public EntityModifier(String str, String str2) {
            this.schemaName = str;
            this.name = str2;
        }

        public PropertyModifier property(String str) {
            return ModelModifier.this.new PropertyModifier(this, str);
        }

        public void remove() {
        }

        public void renameTo(String str) {
        }
    }

    @SuppressFBWarnings
    public class PropertyModifier {
        final EntityModifier entityModifier;
        final String name;

        public PropertyModifier(EntityModifier entityModifier, String str) {
            this.entityModifier = entityModifier;
            this.name = str;
        }

        public void remove() {
        }

        public void renameTo(String str) {
        }
    }

    public EntityModifier entity(String str) {
        return new EntityModifier("default", str);
    }
}
