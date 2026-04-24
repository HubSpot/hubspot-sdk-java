// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.calling

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectCoordinatesTest {

    @Test
    fun create() {
        val objectCoordinates =
            ObjectCoordinates.builder()
                .objectId(0L)
                .objectTypeId("objectTypeId")
                .portalId(0)
                .build()

        assertThat(objectCoordinates.objectId()).isEqualTo(0L)
        assertThat(objectCoordinates.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(objectCoordinates.portalId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectCoordinates =
            ObjectCoordinates.builder()
                .objectId(0L)
                .objectTypeId("objectTypeId")
                .portalId(0)
                .build()

        val roundtrippedObjectCoordinates =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectCoordinates),
                jacksonTypeRef<ObjectCoordinates>(),
            )

        assertThat(roundtrippedObjectCoordinates).isEqualTo(objectCoordinates)
    }
}
