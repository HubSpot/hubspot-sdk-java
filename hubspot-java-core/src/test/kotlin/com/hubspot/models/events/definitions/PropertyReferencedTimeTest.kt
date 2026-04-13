// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyReferencedTimeTest {

    @Test
    fun create() {
        val propertyReferencedTime =
            PropertyReferencedTime.builder()
                .property("property")
                .referenceType(PropertyReferencedTime.ReferenceType.ANNIVERSARY)
                .timeType(PropertyReferencedTime.TimeType.PROPERTY_REFERENCED)
                .timezoneSource(PropertyReferencedTime.TimezoneSource.CUSTOM)
                .zoneId("zoneId")
                .build()

        assertThat(propertyReferencedTime.property()).isEqualTo("property")
        assertThat(propertyReferencedTime.referenceType())
            .isEqualTo(PropertyReferencedTime.ReferenceType.ANNIVERSARY)
        assertThat(propertyReferencedTime.timeType())
            .isEqualTo(PropertyReferencedTime.TimeType.PROPERTY_REFERENCED)
        assertThat(propertyReferencedTime.timezoneSource())
            .isEqualTo(PropertyReferencedTime.TimezoneSource.CUSTOM)
        assertThat(propertyReferencedTime.zoneId()).isEqualTo("zoneId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyReferencedTime =
            PropertyReferencedTime.builder()
                .property("property")
                .referenceType(PropertyReferencedTime.ReferenceType.ANNIVERSARY)
                .timeType(PropertyReferencedTime.TimeType.PROPERTY_REFERENCED)
                .timezoneSource(PropertyReferencedTime.TimezoneSource.CUSTOM)
                .zoneId("zoneId")
                .build()

        val roundtrippedPropertyReferencedTime =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyReferencedTime),
                jacksonTypeRef<PropertyReferencedTime>(),
            )

        assertThat(roundtrippedPropertyReferencedTime).isEqualTo(propertyReferencedTime)
    }
}
