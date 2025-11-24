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
                .dataSensitivity(PropertyValue.DataSensitivity.HIGH)
                .isEncrypted(true)
                .isLargeValue(true)
                .name("name")
                .persistenceTimestamp(0L)
                .requestId("requestId")
                .selectedByUser(true)
                .selectedByUserTimestamp(0L)
                .source(PropertyValue.Source.ACADEMY)
                .sourceId("sourceId")
                .sourceLabel("sourceLabel")
                .sourceMetadata("sourceMetadata")
                .addSourceVid(0L)
                .timestamp(0L)
                .unit("unit")
                .updatedByUserId(0)
                .useTimestampAsPersistenceTimestamp(true)
                .value("value")
                .build()

        assertThat(propertyValue.dataSensitivity()).isEqualTo(PropertyValue.DataSensitivity.HIGH)
        assertThat(propertyValue.isEncrypted()).isEqualTo(true)
        assertThat(propertyValue.isLargeValue()).isEqualTo(true)
        assertThat(propertyValue.name()).isEqualTo("name")
        assertThat(propertyValue.persistenceTimestamp()).isEqualTo(0L)
        assertThat(propertyValue.requestId()).isEqualTo("requestId")
        assertThat(propertyValue.selectedByUser()).isEqualTo(true)
        assertThat(propertyValue.selectedByUserTimestamp()).isEqualTo(0L)
        assertThat(propertyValue.source()).isEqualTo(PropertyValue.Source.ACADEMY)
        assertThat(propertyValue.sourceId()).isEqualTo("sourceId")
        assertThat(propertyValue.sourceLabel()).isEqualTo("sourceLabel")
        assertThat(propertyValue.sourceMetadata()).isEqualTo("sourceMetadata")
        assertThat(propertyValue.sourceVid()).containsExactly(0L)
        assertThat(propertyValue.timestamp()).isEqualTo(0L)
        assertThat(propertyValue.unit()).isEqualTo("unit")
        assertThat(propertyValue.updatedByUserId()).isEqualTo(0)
        assertThat(propertyValue.useTimestampAsPersistenceTimestamp()).isEqualTo(true)
        assertThat(propertyValue.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyValue =
            PropertyValue.builder()
                .dataSensitivity(PropertyValue.DataSensitivity.HIGH)
                .isEncrypted(true)
                .isLargeValue(true)
                .name("name")
                .persistenceTimestamp(0L)
                .requestId("requestId")
                .selectedByUser(true)
                .selectedByUserTimestamp(0L)
                .source(PropertyValue.Source.ACADEMY)
                .sourceId("sourceId")
                .sourceLabel("sourceLabel")
                .sourceMetadata("sourceMetadata")
                .addSourceVid(0L)
                .timestamp(0L)
                .unit("unit")
                .updatedByUserId(0)
                .useTimestampAsPersistenceTimestamp(true)
                .value("value")
                .build()

        val roundtrippedPropertyValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyValue),
                jacksonTypeRef<PropertyValue>(),
            )

        assertThat(roundtrippedPropertyValue).isEqualTo(propertyValue)
    }
}
