// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.pipelines.PipelineCreateParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineDeleteParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetAuditParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineListParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineReplaceParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStageInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStagePatchInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStageReplaceInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelineUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PipelineServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val pipelineStageFuture =
            pipelineServiceAsync.create(
                PipelineCreateParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .pipelineStageInput(
                        PipelineStageInput.builder()
                            .displayOrder(0)
                            .label("label")
                            .metadata(
                                PipelineStageInput.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .stageId("stageId")
                            .build()
                    )
                    .build()
            )

        val pipelineStage = pipelineStageFuture.get()
        pipelineStage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val pipelineStageFuture =
            pipelineServiceAsync.update(
                PipelineUpdateParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .pipelineStagePatchInput(
                        PipelineStagePatchInput.builder()
                            .metadata(
                                PipelineStagePatchInput.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .archived(true)
                            .displayOrder(0)
                            .label("label")
                            .build()
                    )
                    .build()
            )

        val pipelineStage = pipelineStageFuture.get()
        pipelineStage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val collectionResponsePipelineStageNoPagingFuture =
            pipelineServiceAsync.list(
                PipelineListParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .build()
            )

        val collectionResponsePipelineStageNoPaging =
            collectionResponsePipelineStageNoPagingFuture.get()
        collectionResponsePipelineStageNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val future =
            pipelineServiceAsync.delete(
                PipelineDeleteParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val pipelineStageFuture =
            pipelineServiceAsync.get(
                PipelineGetParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .build()
            )

        val pipelineStage = pipelineStageFuture.get()
        pipelineStage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAudit() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val collectionResponsePublicAuditInfoNoPagingFuture =
            pipelineServiceAsync.getAudit(
                PipelineGetAuditParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .build()
            )

        val collectionResponsePublicAuditInfoNoPaging =
            collectionResponsePublicAuditInfoNoPagingFuture.get()
        collectionResponsePublicAuditInfoNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val pipelineStageFuture =
            pipelineServiceAsync.replace(
                PipelineReplaceParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .pipelineStageReplaceInput(
                        PipelineStageReplaceInput.builder()
                            .displayOrder(0)
                            .label("label")
                            .metadata(
                                PipelineStageReplaceInput.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val pipelineStage = pipelineStageFuture.get()
        pipelineStage.validate()
    }
}
