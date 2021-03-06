/*
 *  Copyright (C) 2009 WaveMaker Software, Inc.
 *
 *  This file is part of the WaveMaker Server Runtime.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.wavemaker.runtime.data.sample.sakila;

// Generated Jul 5, 2007 6:21:54 PM by Hibernate Tools 3.2.0.b9

/**
 * ActorInfoId generated by hbm2java
 */
@SuppressWarnings({ "serial" })
public class ActorInfoId implements java.io.Serializable {

    private short actorId;

    private String firstName;

    private String lastName;

    private String filmInfo;

    public ActorInfoId() {
    }

    public ActorInfoId(short actorId, String firstName, String lastName) {
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ActorInfoId(short actorId, String firstName, String lastName, String filmInfo) {
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.filmInfo = filmInfo;
    }

    public short getActorId() {
        return this.actorId;
    }

    public void setActorId(short actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFilmInfo() {
        return this.filmInfo;
    }

    public void setFilmInfo(String filmInfo) {
        this.filmInfo = filmInfo;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (!(other instanceof ActorInfoId)) {
            return false;
        }
        ActorInfoId castOther = (ActorInfoId) other;

        return this.getActorId() == castOther.getActorId()
            && (this.getFirstName() == castOther.getFirstName() || this.getFirstName() != null && castOther.getFirstName() != null
                && this.getFirstName().equals(castOther.getFirstName()))
            && (this.getLastName() == castOther.getLastName() || this.getLastName() != null && castOther.getLastName() != null
                && this.getLastName().equals(castOther.getLastName()))
            && (this.getFilmInfo() == castOther.getFilmInfo() || this.getFilmInfo() != null && castOther.getFilmInfo() != null
                && this.getFilmInfo().equals(castOther.getFilmInfo()));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getActorId();
        result = 37 * result + (getFirstName() == null ? 0 : this.getFirstName().hashCode());
        result = 37 * result + (getLastName() == null ? 0 : this.getLastName().hashCode());
        result = 37 * result + (getFilmInfo() == null ? 0 : this.getFilmInfo().hashCode());
        return result;
    }

}
