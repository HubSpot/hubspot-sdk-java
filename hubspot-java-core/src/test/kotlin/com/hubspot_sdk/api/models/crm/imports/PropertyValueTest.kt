// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.imports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyValueTest {

    @Test
    fun create() {
        val propertyValue =
            PropertyValue.builder()
                .dataSensitivity(PropertyValue.DataSensitivity.NONE)
                .isEncrypted(false)
                .isLargeValue(true)
                .name("")
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
                .value("")
                .build()

        assertThat(propertyValue.dataSensitivity()).isEqualTo(PropertyValue.DataSensitivity.NONE)
        assertThat(propertyValue.isEncrypted()).isEqualTo(false)
        assertThat(propertyValue.isLargeValue()).isEqualTo(true)
        assertThat(propertyValue.name()).isEqualTo("")
        assertThat(propertyValue.persistenceTimestamp()).isEqualTo(0L)
        assertThat(propertyValue.requestId()).isEqualTo("")
        assertThat(propertyValue.selectedByUser()).isEqualTo(false)
        assertThat(propertyValue.selectedByUserTimestamp()).isEqualTo(0L)
        assertThat(propertyValue.source()).isEqualTo(PropertyValue.Source.UNKNOWN)
        assertThat(propertyValue.sourceId()).isEqualTo("")
        assertThat(propertyValue.sourceLabel()).isEqualTo("")
        assertThat(propertyValue.sourceMetadata()).isEqualTo("")
        assertThat(propertyValue.sourceVid()).containsExactly(0L)
        assertThat(propertyValue.timestamp()).isEqualTo(0L)
        assertThat(propertyValue.unit()).isEqualTo("")
        assertThat(propertyValue.updatedByUserId()).isEqualTo(0)
        assertThat(propertyValue.useTimestampAsPersistenceTimestamp()).isEqualTo(true)
        assertThat(propertyValue.value()).isEqualTo("")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyValue =
            PropertyValue.builder()
                .dataSensitivity(PropertyValue.DataSensitivity.NONE)
                .isEncrypted(false)
                .isLargeValue(true)
                .name("")
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
                .value("")
                .build()

        val roundtrippedPropertyValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyValue),
                jacksonTypeRef<PropertyValue>(),
            )

        assertThat(roundtrippedPropertyValue).isEqualTo(propertyValue)
    }
}
