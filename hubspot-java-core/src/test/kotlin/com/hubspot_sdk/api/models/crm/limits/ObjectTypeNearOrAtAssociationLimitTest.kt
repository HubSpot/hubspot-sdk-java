// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectTypeNearOrAtAssociationLimitTest {

    @Test
    fun create() {
        val objectTypeNearOrAtAssociationLimit =
            ObjectTypeNearOrAtAssociationLimit.builder()
                .hasRecordsAtLimit(true)
                .hasRecordsNearLimit(true)
                .objectTypeId("objectTypeId")
                .pluralLabel("pluralLabel")
                .singularLabel("singularLabel")
                .build()

        assertThat(objectTypeNearOrAtAssociationLimit.hasRecordsAtLimit()).isEqualTo(true)
        assertThat(objectTypeNearOrAtAssociationLimit.hasRecordsNearLimit()).isEqualTo(true)
        assertThat(objectTypeNearOrAtAssociationLimit.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(objectTypeNearOrAtAssociationLimit.pluralLabel()).isEqualTo("pluralLabel")
        assertThat(objectTypeNearOrAtAssociationLimit.singularLabel()).isEqualTo("singularLabel")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectTypeNearOrAtAssociationLimit =
            ObjectTypeNearOrAtAssociationLimit.builder()
                .hasRecordsAtLimit(true)
                .hasRecordsNearLimit(true)
                .objectTypeId("objectTypeId")
                .pluralLabel("pluralLabel")
                .singularLabel("singularLabel")
                .build()

        val roundtrippedObjectTypeNearOrAtAssociationLimit =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectTypeNearOrAtAssociationLimit),
                jacksonTypeRef<ObjectTypeNearOrAtAssociationLimit>(),
            )

        assertThat(roundtrippedObjectTypeNearOrAtAssociationLimit)
            .isEqualTo(objectTypeNearOrAtAssociationLimit)
    }
}
