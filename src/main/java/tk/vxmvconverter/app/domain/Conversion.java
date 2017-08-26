package tk.vxmvconverter.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Blob;
import java.time.ZonedDateTime;

@Entity
@Table(name = "conversion")
public class Conversion {
    private String uuid;
    private ZonedDateTime conversionRequest;
    private ZonedDateTime conversionCompleted;
    private Blob data;
    private DestinationVersion destinationVersion;
    private ElementType elementType;

    @Id
    @Column(name = "uuid")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Column(name = "conversion_request")
    public ZonedDateTime getConversionRequest() {
        return conversionRequest;
    }

    public void setConversionRequest(ZonedDateTime conversionRequest) {
        this.conversionRequest = conversionRequest;
    }

    @Column(name = "conversion_completed")
    public ZonedDateTime getConversionCompleted() {
        return conversionCompleted;
    }

    public void setConversionCompleted(ZonedDateTime conversionCompleted) {
        this.conversionCompleted = conversionCompleted;
    }

    @Column(name = "data")
    public Blob getData() {
        return data;
    }

    public void setData(Blob data) {
        this.data = data;
    }

    @Column(name = "destination_version")
    public DestinationVersion getDestinationVersion() {
        return destinationVersion;
    }

    public void setDestinationVersion(DestinationVersion destinationVersion) {
        this.destinationVersion = destinationVersion;
    }

    @Column(name = "element_type")
    public ElementType getElementType() {
        return elementType;
    }

    public void setElementType(ElementType elementType) {
        this.elementType = elementType;
    }
}