// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiFetchedObjectPropertyValueTest {

    @Test
    fun create() {
        val apiFetchedObjectPropertyValue =
            ApiFetchedObjectPropertyValue.builder()
                .propertyToken("propertyToken")
                .type(ApiFetchedObjectPropertyValue.Type.FETCHED_OBJECT_PROPERTY)
                .build()

        assertThat(apiFetchedObjectPropertyValue.propertyToken()).isEqualTo("propertyToken")
        assertThat(apiFetchedObjectPropertyValue.type())
            .isEqualTo(ApiFetchedObjectPropertyValue.Type.FETCHED_OBJECT_PROPERTY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiFetchedObjectPropertyValue =
            ApiFetchedObjectPropertyValue.builder()
                .propertyToken("propertyToken")
                .type(ApiFetchedObjectPropertyValue.Type.FETCHED_OBJECT_PROPERTY)
                .build()

        val roundtrippedApiFetchedObjectPropertyValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiFetchedObjectPropertyValue),
                jacksonTypeRef<ApiFetchedObjectPropertyValue>(),
            )

        assertThat(roundtrippedApiFetchedObjectPropertyValue)
            .isEqualTo(apiFetchedObjectPropertyValue)
    }
}
