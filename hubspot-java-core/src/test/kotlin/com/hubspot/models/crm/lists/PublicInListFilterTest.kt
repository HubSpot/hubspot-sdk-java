// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicInListFilterTest {

    @Test
    fun create() {
        val publicInListFilter =
            PublicInListFilter.builder()
                .filterType(PublicInListFilter.FilterType.IN_LIST)
                .listId("listId")
                .operator("operator")
                .metadata(
                    PublicInListFilterMetadata.builder().id("id").inListType("inListType").build()
                )
                .build()

        assertThat(publicInListFilter.filterType()).isEqualTo(PublicInListFilter.FilterType.IN_LIST)
        assertThat(publicInListFilter.listId()).isEqualTo("listId")
        assertThat(publicInListFilter.operator()).isEqualTo("operator")
        assertThat(publicInListFilter.metadata())
            .contains(
                PublicInListFilterMetadata.builder().id("id").inListType("inListType").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicInListFilter =
            PublicInListFilter.builder()
                .filterType(PublicInListFilter.FilterType.IN_LIST)
                .listId("listId")
                .operator("operator")
                .metadata(
                    PublicInListFilterMetadata.builder().id("id").inListType("inListType").build()
                )
                .build()

        val roundtrippedPublicInListFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicInListFilter),
                jacksonTypeRef<PublicInListFilter>(),
            )

        assertThat(roundtrippedPublicInListFilter).isEqualTo(publicInListFilter)
    }
}
