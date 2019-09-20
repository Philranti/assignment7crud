package za.ac.cput.projects.assignment7crud.domains.Settings;

import java.util.Objects;

public class DefaultSettings {
    private String controllerSettings;
    private String onscreenDisplay;
    private int volumeSettings;
    private String language;

    public DefaultSettings() {
    }

    private DefaultSettings(Builder builder) {
        this.controllerSettings = builder.controllerSettings;
        this.onscreenDisplay = builder.onscreenDisplay;
        this.volumeSettings = builder.volumeSettings;
        this.language = builder.language;
    }

    public String getControllerSettings() {
        return controllerSettings;
    }

    public String getOnscreenDisplay() {
        return onscreenDisplay;
    }

    public int getVolumeSettings() {
        return volumeSettings;
    }

    public String getLanguage() {
        return language;
    }

    public static class Builder{

        private String controllerSettings;
        private String onscreenDisplay;
        private int volumeSettings;
        private String language;

        public Builder controllerSettings(String controllerSettings) {
            this.controllerSettings = controllerSettings;
            return this;
        }

        public Builder onscreenDisplay(String onscreenDisplay) {
            this.onscreenDisplay = onscreenDisplay;
            return this;
        }

        public Builder volumeSettings(int volumeSettings) {
            this.volumeSettings = volumeSettings;
            return this;
        }

        public Builder language(String language) {
            this.language = language;
            return this;
        }

        public DefaultSettings build() {
            return new DefaultSettings(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DefaultSettings that = (DefaultSettings) o;
        return volumeSettings == that.volumeSettings &&
                Objects.equals(controllerSettings, that.controllerSettings) &&
                Objects.equals(onscreenDisplay, that.onscreenDisplay) &&
                Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {

        return Objects.hash(controllerSettings, onscreenDisplay, volumeSettings, language);
    }

    @Override
    public String toString() {
        return "DefaultSettings{" +
                "controllerSettings='" + controllerSettings + '\'' +
                ", onscreenDisplay='" + onscreenDisplay + '\'' +
                ", volumeSettings=" + volumeSettings +
                ", Language='" + language + '\'' +
                '}';
    }
}
