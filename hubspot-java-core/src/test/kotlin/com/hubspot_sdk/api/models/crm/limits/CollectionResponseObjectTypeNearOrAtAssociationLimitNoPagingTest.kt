// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseObjectTypeNearOrAtAssociationLimitNoPagingTest {

    @Test
    fun create() {
        val collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
            CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging.builder()
                .addResult(
                    ObjectTypeNearOrAtAssociationLimit.builder()
                        .hasRecordsAtLimit(true)
                        .hasRecordsNearLimit(true)
                        .objectTypeId("objectTypeId")
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .build()
                )
                .build()

        assertThat(collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging.results())
            .containsExactly(
                ObjectTypeNearOrAtAssociationLimit.builder()
                    .hasRecordsAtLimit(true)
                    .hasRecordsNearLimit(true)
                    .objectTypeId("objectTypeId")
                    .pluralLabel("pluralLabel")
                    .singularLabel("singularLabel")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
            CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging.builder()
                .addResult(
                    ObjectTypeNearOrAtAssociationLimit.builder()
                        .hasRecordsAtLimit(true)
                        .hasRecordsNearLimit(true)
                        .objectTypeId("objectTypeId")
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging
                ),
                jacksonTypeRef<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging)
            .isEqualTo(collectionResponseObjectTypeNearOrAtAssociationLimitNoPaging)
    }
}
