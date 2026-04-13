// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.urlmappings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlMappingsUrlMappingTest {

    @Test
    fun create() {
        val urlMappingsUrlMapping =
            UrlMappingsUrlMapping.builder()
                .id(0L)
                .cdnPurgeEmbargoTime(0L)
                .contentGroupId(0L)
                .cosObjectType(UrlMappingsUrlMapping.CosObjectType.ACCESS_GROUP_MEMBERSHIP)
                .created(0L)
                .createdById(0)
                .deletedAt(0L)
                .destination("destination")
                .internallyCreated(true)
                .isActive(true)
                .isMatchFullUrl(true)
                .isMatchQueryString(true)
                .isOnlyAfterNotFound(true)
                .isPattern(true)
                .isProtocolAgnostic(true)
                .isRegex(true)
                .isTrailingSlashOptional(true)
                .label("label")
                .name("name")
                .note("note")
                .portalId(0)
                .precedence(0)
                .redirectStyle(0)
                .routePrefix("routePrefix")
                .updated(0L)
                .updatedById(0)
                .build()

        assertThat(urlMappingsUrlMapping.id()).isEqualTo(0L)
        assertThat(urlMappingsUrlMapping.cdnPurgeEmbargoTime()).isEqualTo(0L)
        assertThat(urlMappingsUrlMapping.contentGroupId()).isEqualTo(0L)
        assertThat(urlMappingsUrlMapping.cosObjectType())
            .isEqualTo(UrlMappingsUrlMapping.CosObjectType.ACCESS_GROUP_MEMBERSHIP)
        assertThat(urlMappingsUrlMapping.created()).isEqualTo(0L)
        assertThat(urlMappingsUrlMapping.createdById()).isEqualTo(0)
        assertThat(urlMappingsUrlMapping.deletedAt()).isEqualTo(0L)
        assertThat(urlMappingsUrlMapping.destination()).isEqualTo("destination")
        assertThat(urlMappingsUrlMapping.internallyCreated()).isEqualTo(true)
        assertThat(urlMappingsUrlMapping.isActive()).isEqualTo(true)
        assertThat(urlMappingsUrlMapping.isMatchFullUrl()).isEqualTo(true)
        assertThat(urlMappingsUrlMapping.isMatchQueryString()).isEqualTo(true)
        assertThat(urlMappingsUrlMapping.isOnlyAfterNotFound()).isEqualTo(true)
        assertThat(urlMappingsUrlMapping.isPattern()).isEqualTo(true)
        assertThat(urlMappingsUrlMapping.isProtocolAgnostic()).isEqualTo(true)
        assertThat(urlMappingsUrlMapping.isRegex()).isEqualTo(true)
        assertThat(urlMappingsUrlMapping.isTrailingSlashOptional()).isEqualTo(true)
        assertThat(urlMappingsUrlMapping.label()).isEqualTo("label")
        assertThat(urlMappingsUrlMapping.name()).isEqualTo("name")
        assertThat(urlMappingsUrlMapping.note()).isEqualTo("note")
        assertThat(urlMappingsUrlMapping.portalId()).isEqualTo(0)
        assertThat(urlMappingsUrlMapping.precedence()).isEqualTo(0)
        assertThat(urlMappingsUrlMapping.redirectStyle()).isEqualTo(0)
        assertThat(urlMappingsUrlMapping.routePrefix()).isEqualTo("routePrefix")
        assertThat(urlMappingsUrlMapping.updated()).isEqualTo(0L)
        assertThat(urlMappingsUrlMapping.updatedById()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val urlMappingsUrlMapping =
            UrlMappingsUrlMapping.builder()
                .id(0L)
                .cdnPurgeEmbargoTime(0L)
                .contentGroupId(0L)
                .cosObjectType(UrlMappingsUrlMapping.CosObjectType.ACCESS_GROUP_MEMBERSHIP)
                .created(0L)
                .createdById(0)
                .deletedAt(0L)
                .destination("destination")
                .internallyCreated(true)
                .isActive(true)
                .isMatchFullUrl(true)
                .isMatchQueryString(true)
                .isOnlyAfterNotFound(true)
                .isPattern(true)
                .isProtocolAgnostic(true)
                .isRegex(true)
                .isTrailingSlashOptional(true)
                .label("label")
                .name("name")
                .note("note")
                .portalId(0)
                .precedence(0)
                .redirectStyle(0)
                .routePrefix("routePrefix")
                .updated(0L)
                .updatedById(0)
                .build()

        val roundtrippedUrlMappingsUrlMapping =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(urlMappingsUrlMapping),
                jacksonTypeRef<UrlMappingsUrlMapping>(),
            )

        assertThat(roundtrippedUrlMappingsUrlMapping).isEqualTo(urlMappingsUrlMapping)
    }
}
