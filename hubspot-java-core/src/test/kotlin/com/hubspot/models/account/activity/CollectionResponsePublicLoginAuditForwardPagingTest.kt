// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.account.activity

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.ForwardPaging
import com.hubspot.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicLoginAuditForwardPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicLoginAuditForwardPaging =
            CollectionResponsePublicLoginAuditForwardPaging.builder()
                .addResult(
                    PublicLoginAudit.builder()
                        .id("id")
                        .loginAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .loginSucceeded(true)
                        .countryCode("countryCode")
                        .email("email")
                        .ipAddress("ipAddress")
                        .location("location")
                        .regionCode("regionCode")
                        .userAgent("userAgent")
                        .userId(0)
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicLoginAuditForwardPaging.results())
            .containsExactly(
                PublicLoginAudit.builder()
                    .id("id")
                    .loginAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .loginSucceeded(true)
                    .countryCode("countryCode")
                    .email("email")
                    .ipAddress("ipAddress")
                    .location("location")
                    .regionCode("regionCode")
                    .userAgent("userAgent")
                    .userId(0)
                    .build()
            )
        assertThat(collectionResponsePublicLoginAuditForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicLoginAuditForwardPaging =
            CollectionResponsePublicLoginAuditForwardPaging.builder()
                .addResult(
                    PublicLoginAudit.builder()
                        .id("id")
                        .loginAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .loginSucceeded(true)
                        .countryCode("countryCode")
                        .email("email")
                        .ipAddress("ipAddress")
                        .location("location")
                        .regionCode("regionCode")
                        .userAgent("userAgent")
                        .userId(0)
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicLoginAuditForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicLoginAuditForwardPaging),
                jacksonTypeRef<CollectionResponsePublicLoginAuditForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicLoginAuditForwardPaging)
            .isEqualTo(collectionResponsePublicLoginAuditForwardPaging)
    }
}
