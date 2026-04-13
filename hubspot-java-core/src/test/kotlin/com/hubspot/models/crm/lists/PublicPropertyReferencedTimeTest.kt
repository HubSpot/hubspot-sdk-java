// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicPropertyReferencedTimeTest {

    @Test
    fun create() {
        val publicPropertyReferencedTime =
            PublicPropertyReferencedTime.builder()
                .property("property")
                .referenceType("referenceType")
                .timeType(PublicPropertyReferencedTime.TimeType.PROPERTY_REFERENCED)
                .zoneId("zoneId")
                .timezoneSource("timezoneSource")
                .build()

        assertThat(publicPropertyReferencedTime.property()).isEqualTo("property")
        assertThat(publicPropertyReferencedTime.referenceType()).isEqualTo("referenceType")
        assertThat(publicPropertyReferencedTime.timeType())
            .isEqualTo(PublicPropertyReferencedTime.TimeType.PROPERTY_REFERENCED)
        assertThat(publicPropertyReferencedTime.zoneId()).isEqualTo("zoneId")
        assertThat(publicPropertyReferencedTime.timezoneSource()).contains("timezoneSource")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicPropertyReferencedTime =
            PublicPropertyReferencedTime.builder()
                .property("property")
                .referenceType("referenceType")
                .timeType(PublicPropertyReferencedTime.TimeType.PROPERTY_REFERENCED)
                .zoneId("zoneId")
                .timezoneSource("timezoneSource")
                .build()

        val roundtrippedPublicPropertyReferencedTime =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicPropertyReferencedTime),
                jacksonTypeRef<PublicPropertyReferencedTime>(),
            )

        assertThat(roundtrippedPublicPropertyReferencedTime).isEqualTo(publicPropertyReferencedTime)
    }
}
