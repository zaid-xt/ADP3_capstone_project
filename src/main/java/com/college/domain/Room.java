package com.college.domain;

// remove setters from class

public class Room {
    private String roomID;
    private String roomType;
    private float pricePerNight;
    private Boolean availability;
    private String features;

    public Room() {

    }

    public Room(String roomID, String roomType, float pricePerNight, Boolean availability, String features) {
        this.roomID = roomID;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.availability = availability;
        this.features = features;
    }

    /// Builder Constructor
    private Room(RoomBuilder builder){
        this.roomID = builder.roomID;
        this.roomType = builder.roomType;
        this.pricePerNight = builder.pricePerNight;
        this.availability = builder.availability;
        this.features = builder.features;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public float getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(float pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomID='" + roomID + '\'' +
                ", roomType='" + roomType + '\'' +
                ", pricePerNight=" + pricePerNight +
                ", availability=" + availability +
                ", features='" + features + '\'' +
                '}';
    }

    /// Builder pattern
    public static class RoomBuilder{
        private String roomID;
        private String roomType;
        private float pricePerNight;
        private Boolean availability;
        private String features;

        public RoomBuilder(String roomID, String roomType, float pricePerNight, Boolean availability, String features) {
            this.roomID = roomID;
            this.roomType = roomType;
            this.pricePerNight = pricePerNight;
            this.availability = availability;
            this.features = features;
        }

        public RoomBuilder setRoomID(String roomID) {
            this.roomID = roomID;
            return this;
        }

        public RoomBuilder setRoomType(String roomType) {
            this.roomType = roomType;
            return this;
        }

        public RoomBuilder  setPricePerNight(float pricePerNight) {
            this.pricePerNight = pricePerNight;
            return this;
        }

        public RoomBuilder  setAvailability(Boolean availability) {
            this.availability = availability;
            return this;
        }

        public RoomBuilder  setFeatures(String features) {
            this.features = features;
            return this;
        }

        /// build method
        public Room build(){
            return new Room(this);
        }
    }
}
