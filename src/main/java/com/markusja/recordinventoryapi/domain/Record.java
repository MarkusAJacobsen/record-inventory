package com.markusja.recordinventoryapi.domain;

import jakarta.persistence.*;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "inventory")
@Builder
@Getter
@Setter
public class Record {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String title;

    @NotBlank
    private String artist;

    private String label;

    private String country;

    private Integer year;

    private String format;

    private String genre;

    private Integer nrOfTracks;

    @Min(1)
    @Positive
    @NotNull
    private Integer quantity;

    @Version
    private Integer version;

    public Record() {
    }

    public Record(Integer id, String title, String artist, String label, String country, Integer year, String format, String genre, Integer nrOfTracks, Integer quantity, Integer version) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.label = label;
        this.country = country;
        this.year = year;
        this.format = format;
        this.genre = genre;
        this.nrOfTracks = nrOfTracks;
        this.quantity = quantity;
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return id == record.id && Objects.equals(title, record.title) && Objects.equals(artist, record.artist) && Objects.equals(label, record.label) && Objects.equals(country, record.country) && Objects.equals(year, record.year) && Objects.equals(format, record.format) && Objects.equals(genre, record.genre) && Objects.equals(nrOfTracks, record.nrOfTracks) && Objects.equals(quantity, record.quantity) && Objects.equals(version, record.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, artist, label, country, year, format, genre, nrOfTracks, quantity, version);
    }

    @Override
    public String toString() {
        return "Record{" + "id=" + id + ", title='" + title + '\'' + ", artist='" + artist + '\'' + ", label='" + label + '\'' + ", country='" + country + '\'' + ", year=" + year + ", format='" + format + '\'' + ", genre='" + genre + '\'' + ", nrOfTracks=" + nrOfTracks + ", quantity=" + quantity + ", version=" + version + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getNrOfTracks() {
        return nrOfTracks;
    }

    public void setNrOfTracks(Integer nrOfTracks) {
        this.nrOfTracks = nrOfTracks;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
