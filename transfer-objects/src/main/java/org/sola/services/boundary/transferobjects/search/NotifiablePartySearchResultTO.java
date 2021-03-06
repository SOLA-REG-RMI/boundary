/**
 * ******************************************************************************************
 * Copyright (C) 2014 - Food and Agriculture Organization of the United Nations (FAO).
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice,this list
 *       of conditions and the following disclaimer.
 *    2. Redistributions in binary form must reproduce the above copyright notice,this list
 *       of conditions and the following disclaimer in the documentation and/or other
 *       materials provided with the distribution.
 *    3. Neither the name of FAO nor the names of its contributors may be used to endorse or
 *       promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 * SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,PROCUREMENT
 * OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,STRICT LIABILITY,OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * *********************************************************************************************
 */
package org.sola.services.boundary.transferobjects.search;

import java.math.BigDecimal;
import org.sola.services.boundary.transferobjects.casemanagement.NotifiablePartyForBaUnitTO;
import org.sola.services.boundary.transferobjects.cadastre.PartySummaryTO;

public class NotifiablePartySearchResultTO extends NotifiablePartyForBaUnitTO {
    private String nameFirstPart;
    private String nameLastPart;
    private String propertyId;
    private String properties;
    private boolean selProperties;
    private Long total;
    private String name;
    private String lastName;
    private String targetPartyName;
    private String targetPartyLastName;
    private String targetPartyId;
    private String groupPartyName;
    private String groupPartyLastName;
    private String groupPartyId;
    
    
    
    
    public NotifiablePartySearchResultTO(){
        super();
    }

    public boolean isSelProperties() {
        return selProperties;
    }

    public void setSelProperties(boolean selProperties) {
        this.selProperties = selProperties;
    }
    
    public String getNameFirstPart() {
        return nameFirstPart;
    }

    public void setNameFirstPart(String nameFirstPart) {
        this.nameFirstPart = nameFirstPart;
    }

    public String getNameLastPart() {
        return nameLastPart;
    }

    public void setNameLastPart(String nameLastPart) {
        this.nameLastPart = nameLastPart;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTargetPartyLastName() {
        return targetPartyLastName;
    }

    public void setTargetPartyLastName(String targetPartyLastName) {
        this.targetPartyLastName = targetPartyLastName;
    }

    public String getTargetPartyName() {
        return targetPartyName;
    }

    public void setTargetPartyName(String targetPartyName) {
        this.targetPartyName = targetPartyName;
    }

    public String getGroupPartyId() {
        return groupPartyId;
    }

    public void setGroupPartyId(String groupPartyId) {
        this.groupPartyId = groupPartyId;
    }

    public String getGroupPartyLastName() {
        return groupPartyLastName;
    }

    public void setGroupPartyLastName(String groupPartyLastName) {
        this.groupPartyLastName = groupPartyLastName;
    }

    public String getGroupPartyName() {
        return groupPartyName;
    }

    public void setGroupPartyName(String groupPartyName) {
        this.groupPartyName = groupPartyName;
    }
    
}
