// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyValueTest {

    @Test
    fun create() {
        val propertyValue =
            PropertyValue.builder()
                .name("")
                .sourceUpstreamDeployable("sourceUpstreamDeployable")
                .value("")
                .dataSensitivity(PropertyValue.DataSensitivity.NONE)
                .isEncrypted(false)
                .isLargeValue(true)
                .persistenceTimestamp(0L)
                .requestId("")
                .selectedByUser(false)
                .selectedByUserTimestamp(0L)
                .source(PropertyValue.Source.UNKNOWN)
                .sourceId("")
                .sourceLabel("")
                .sourceMetadata("")
                .addSourceVid(0L)
                .timestamp(0L)
                .unit("")
                .updatedByUserId(0)
                .useTimestampAsPersistenceTimestamp(true)
                .build()

        assertThat(propertyValue.name()).isEqualTo("")
        assertThat(propertyValue.sourceUpstreamDeployable()).isEqualTo("sourceUpstreamDeployable")
        assertThat(propertyValue.value()).isEqualTo("")
        assertThat(propertyValue.dataSensitivity()).contains(PropertyValue.DataSensitivity.NONE)
        assertThat(propertyValue.isEncrypted()).contains(false)
        assertThat(propertyValue.isLargeValue()).contains(true)
        assertThat(propertyValue.persistenceTimestamp()).contains(0L)
        assertThat(propertyValue.requestId()).contains("")
        assertThat(propertyValue.selectedByUser()).contains(false)
        assertThat(propertyValue.selectedByUserTimestamp()).contains(0L)
        assertThat(propertyValue.source()).contains(PropertyValue.Source.UNKNOWN)
        assertThat(propertyValue.sourceId()).contains("")
        assertThat(propertyValue.sourceLabel()).contains("")
        assertThat(propertyValue.sourceMetadata()).contains("")
        assertThat(propertyValue.sourceVid().getOrNull()).containsExactly(0L)
        assertThat(propertyValue.timestamp()).contains(0L)
        assertThat(propertyValue.unit()).contains("")
        assertThat(propertyValue.updatedByUserId()).contains(0)
        assertThat(propertyValue.useTimestampAsPersistenceTimestamp()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyValue =
            PropertyValue.builder()
                .name("")
                .sourceUpstreamDeployable("sourceUpstreamDeployable")
                .value("")
                .dataSensitivity(PropertyValue.DataSensitivity.NONE)
                .isEncrypted(false)
                .isLargeValue(true)
                .persistenceTimestamp(0L)
                .requestId("")
                .selectedByUser(false)
                .selectedByUserTimestamp(0L)
                .source(PropertyValue.Source.UNKNOWN)
                .sourceId("")
                .sourceLabel("")
                .sourceMetadata("")
                .addSourceVid(0L)
                .timestamp(0L)
                .unit("")
                .updatedByUserId(0)
                .useTimestampAsPersistenceTimestamp(true)
                .build()

        val roundtrippedPropertyValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyValue),
                jacksonTypeRef<PropertyValue>(),
            )

        assertThat(roundtrippedPropertyValue).isEqualTo(propertyValue)
    }
}
