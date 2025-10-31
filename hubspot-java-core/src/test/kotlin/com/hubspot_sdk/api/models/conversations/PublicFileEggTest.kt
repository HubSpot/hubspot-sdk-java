// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicFileEggTest {

    @Test
    fun create() {
        val publicFileEgg =
            PublicFileEgg.builder().fileId("fileId").type(PublicFileEgg.Type.FILE).build()

        assertThat(publicFileEgg.fileId()).isEqualTo("fileId")
        assertThat(publicFileEgg.type()).isEqualTo(PublicFileEgg.Type.FILE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicFileEgg =
            PublicFileEgg.builder().fileId("fileId").type(PublicFileEgg.Type.FILE).build()

        val roundtrippedPublicFileEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicFileEgg),
                jacksonTypeRef<PublicFileEgg>(),
            )

        assertThat(roundtrippedPublicFileEgg).isEqualTo(publicFileEgg)
    }
}
