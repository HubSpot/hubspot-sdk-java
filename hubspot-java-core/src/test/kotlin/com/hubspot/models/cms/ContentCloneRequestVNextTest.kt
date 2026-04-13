// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentCloneRequestVNextTest {

    @Test
    fun create() {
        val contentCloneRequestVNext =
            ContentCloneRequestVNext.builder().id("id").cloneName("cloneName").build()

        assertThat(contentCloneRequestVNext.id()).isEqualTo("id")
        assertThat(contentCloneRequestVNext.cloneName()).contains("cloneName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentCloneRequestVNext =
            ContentCloneRequestVNext.builder().id("id").cloneName("cloneName").build()

        val roundtrippedContentCloneRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentCloneRequestVNext),
                jacksonTypeRef<ContentCloneRequestVNext>(),
            )

        assertThat(roundtrippedContentCloneRequestVNext).isEqualTo(contentCloneRequestVNext)
    }
}
