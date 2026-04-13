// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.crm.pipelines.CollectionResponsePipelineNoPaging
import com.hubspot.sdk.models.crm.pipelines.CollectionResponsePipelineStageNoPaging
import com.hubspot.sdk.models.crm.pipelines.CollectionResponsePublicAuditInfoNoPaging
import com.hubspot.sdk.models.crm.pipelines.Pipeline
import com.hubspot.sdk.models.crm.pipelines.PipelineCreateParams
import com.hubspot.sdk.models.crm.pipelines.PipelineCreateStageParams
import com.hubspot.sdk.models.crm.pipelines.PipelineDeleteParams
import com.hubspot.sdk.models.crm.pipelines.PipelineDeleteStageParams
import com.hubspot.sdk.models.crm.pipelines.PipelineGetParams
import com.hubspot.sdk.models.crm.pipelines.PipelineGetStageParams
import com.hubspot.sdk.models.crm.pipelines.PipelineListAuditParams
import com.hubspot.sdk.models.crm.pipelines.PipelineListParams
import com.hubspot.sdk.models.crm.pipelines.PipelineListStageAuditParams
import com.hubspot.sdk.models.crm.pipelines.PipelineListStagesParams
import com.hubspot.sdk.models.crm.pipelines.PipelineStage
import com.hubspot.sdk.models.crm.pipelines.PipelineUpdateAllPropertiesParams
import com.hubspot.sdk.models.crm.pipelines.PipelineUpdateParams
import com.hubspot.sdk.models.crm.pipelines.PipelineUpdateStageAllPropertiesParams
import com.hubspot.sdk.models.crm.pipelines.PipelineUpdateStageParams
import java.util.function.Consumer

interface PipelineService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PipelineService

    /**
     * Create a new pipeline with the provided property values. The entire pipeline object,
     * including its unique ID, will be returned in the response.
     */
    fun create(objectType: String, params: PipelineCreateParams): Pipeline =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: PipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline = create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: PipelineCreateParams): Pipeline = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline

    /**
     * Perform a partial update of the pipeline identified by `{pipelineId}`. The updated pipeline
     * will be returned in the response.
     */
    fun update(pipelineId: String, params: PipelineUpdateParams): Pipeline =
        update(pipelineId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pipelineId: String,
        params: PipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline = update(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see update */
    fun update(params: PipelineUpdateParams): Pipeline = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline

    /** Return all pipelines for the object type specified by `{objectType}`. */
    fun list(objectType: String): CollectionResponsePipelineNoPaging =
        list(objectType, PipelineListParams.none())

    /** @see list */
    fun list(
        objectType: String,
        params: PipelineListParams = PipelineListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePipelineNoPaging =
        list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(
        objectType: String,
        params: PipelineListParams = PipelineListParams.none(),
    ): CollectionResponsePipelineNoPaging = list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PipelineListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePipelineNoPaging

    /** @see list */
    fun list(params: PipelineListParams): CollectionResponsePipelineNoPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        objectType: String,
        requestOptions: RequestOptions,
    ): CollectionResponsePipelineNoPaging =
        list(objectType, PipelineListParams.none(), requestOptions)

    /** Delete a pipeline */
    fun delete(pipelineId: String, params: PipelineDeleteParams) =
        delete(pipelineId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        pipelineId: String,
        params: PipelineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see delete */
    fun delete(params: PipelineDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: PipelineDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Create a pipeline stage */
    fun createStage(pipelineId: String, params: PipelineCreateStageParams): PipelineStage =
        createStage(pipelineId, params, RequestOptions.none())

    /** @see createStage */
    fun createStage(
        pipelineId: String,
        params: PipelineCreateStageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage =
        createStage(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see createStage */
    fun createStage(params: PipelineCreateStageParams): PipelineStage =
        createStage(params, RequestOptions.none())

    /** @see createStage */
    fun createStage(
        params: PipelineCreateStageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage

    /** Delete a pipeline stage */
    fun deleteStage(stageId: String, params: PipelineDeleteStageParams) =
        deleteStage(stageId, params, RequestOptions.none())

    /** @see deleteStage */
    fun deleteStage(
        stageId: String,
        params: PipelineDeleteStageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteStage(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see deleteStage */
    fun deleteStage(params: PipelineDeleteStageParams) = deleteStage(params, RequestOptions.none())

    /** @see deleteStage */
    fun deleteStage(
        params: PipelineDeleteStageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Return a single pipeline object identified by its unique `{pipelineId}`. */
    fun get(pipelineId: String, params: PipelineGetParams): Pipeline =
        get(pipelineId, params, RequestOptions.none())

    /** @see get */
    fun get(
        pipelineId: String,
        params: PipelineGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline = get(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see get */
    fun get(params: PipelineGetParams): Pipeline = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PipelineGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline

    /** Return a pipeline stage by ID */
    fun getStage(stageId: String, params: PipelineGetStageParams): PipelineStage =
        getStage(stageId, params, RequestOptions.none())

    /** @see getStage */
    fun getStage(
        stageId: String,
        params: PipelineGetStageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage = getStage(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see getStage */
    fun getStage(params: PipelineGetStageParams): PipelineStage =
        getStage(params, RequestOptions.none())

    /** @see getStage */
    fun getStage(
        params: PipelineGetStageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage

    /**
     * Return a reverse chronological list of all mutations that have occurred on the pipeline
     * identified by `{pipelineId}`.
     */
    fun listAudit(
        pipelineId: String,
        params: PipelineListAuditParams,
    ): CollectionResponsePublicAuditInfoNoPaging =
        listAudit(pipelineId, params, RequestOptions.none())

    /** @see listAudit */
    fun listAudit(
        pipelineId: String,
        params: PipelineListAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAuditInfoNoPaging =
        listAudit(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see listAudit */
    fun listAudit(params: PipelineListAuditParams): CollectionResponsePublicAuditInfoNoPaging =
        listAudit(params, RequestOptions.none())

    /** @see listAudit */
    fun listAudit(
        params: PipelineListAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAuditInfoNoPaging

    /**
     * Return a reverse chronological list of all mutations that have occurred on the pipeline stage
     * identified by `{stageId}`.
     */
    fun listStageAudit(
        stageId: String,
        params: PipelineListStageAuditParams,
    ): CollectionResponsePublicAuditInfoNoPaging =
        listStageAudit(stageId, params, RequestOptions.none())

    /** @see listStageAudit */
    fun listStageAudit(
        stageId: String,
        params: PipelineListStageAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAuditInfoNoPaging =
        listStageAudit(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see listStageAudit */
    fun listStageAudit(
        params: PipelineListStageAuditParams
    ): CollectionResponsePublicAuditInfoNoPaging = listStageAudit(params, RequestOptions.none())

    /** @see listStageAudit */
    fun listStageAudit(
        params: PipelineListStageAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAuditInfoNoPaging

    /** Return all the stages associated with the pipeline identified by `{pipelineId}`. */
    fun listStages(
        pipelineId: String,
        params: PipelineListStagesParams,
    ): CollectionResponsePipelineStageNoPaging =
        listStages(pipelineId, params, RequestOptions.none())

    /** @see listStages */
    fun listStages(
        pipelineId: String,
        params: PipelineListStagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePipelineStageNoPaging =
        listStages(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see listStages */
    fun listStages(params: PipelineListStagesParams): CollectionResponsePipelineStageNoPaging =
        listStages(params, RequestOptions.none())

    /** @see listStages */
    fun listStages(
        params: PipelineListStagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePipelineStageNoPaging

    /** Replace a pipeline */
    fun updateAllProperties(
        pipelineId: String,
        params: PipelineUpdateAllPropertiesParams,
    ): Pipeline = updateAllProperties(pipelineId, params, RequestOptions.none())

    /** @see updateAllProperties */
    fun updateAllProperties(
        pipelineId: String,
        params: PipelineUpdateAllPropertiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline =
        updateAllProperties(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see updateAllProperties */
    fun updateAllProperties(params: PipelineUpdateAllPropertiesParams): Pipeline =
        updateAllProperties(params, RequestOptions.none())

    /** @see updateAllProperties */
    fun updateAllProperties(
        params: PipelineUpdateAllPropertiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline

    fun updateStage(stageId: String, params: PipelineUpdateStageParams): PipelineStage =
        updateStage(stageId, params, RequestOptions.none())

    /** @see updateStage */
    fun updateStage(
        stageId: String,
        params: PipelineUpdateStageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage = updateStage(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see updateStage */
    fun updateStage(params: PipelineUpdateStageParams): PipelineStage =
        updateStage(params, RequestOptions.none())

    /** @see updateStage */
    fun updateStage(
        params: PipelineUpdateStageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage

    /**
     * Replace all the properties of an existing pipeline stage with the values provided. The
     * updated stage will be returned in the response.
     */
    fun updateStageAllProperties(
        stageId: String,
        params: PipelineUpdateStageAllPropertiesParams,
    ): PipelineStage = updateStageAllProperties(stageId, params, RequestOptions.none())

    /** @see updateStageAllProperties */
    fun updateStageAllProperties(
        stageId: String,
        params: PipelineUpdateStageAllPropertiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage =
        updateStageAllProperties(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see updateStageAllProperties */
    fun updateStageAllProperties(params: PipelineUpdateStageAllPropertiesParams): PipelineStage =
        updateStageAllProperties(params, RequestOptions.none())

    /** @see updateStageAllProperties */
    fun updateStageAllProperties(
        params: PipelineUpdateStageAllPropertiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage

    /** A view of [PipelineService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PipelineService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/pipelines/2026-03/{objectType}`, but is
         * otherwise the same as [PipelineService.create].
         */
        @MustBeClosed
        fun create(objectType: String, params: PipelineCreateParams): HttpResponseFor<Pipeline> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            objectType: String,
            params: PipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: PipelineCreateParams): HttpResponseFor<Pipeline> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline>

        /**
         * Returns a raw HTTP response for `patch /crm/pipelines/2026-03/{objectType}/{pipelineId}`,
         * but is otherwise the same as [PipelineService.update].
         */
        @MustBeClosed
        fun update(pipelineId: String, params: PipelineUpdateParams): HttpResponseFor<Pipeline> =
            update(pipelineId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pipelineId: String,
            params: PipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline> =
            update(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PipelineUpdateParams): HttpResponseFor<Pipeline> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline>

        /**
         * Returns a raw HTTP response for `get /crm/pipelines/2026-03/{objectType}`, but is
         * otherwise the same as [PipelineService.list].
         */
        @MustBeClosed
        fun list(objectType: String): HttpResponseFor<CollectionResponsePipelineNoPaging> =
            list(objectType, PipelineListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            params: PipelineListParams = PipelineListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePipelineNoPaging> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            params: PipelineListParams = PipelineListParams.none(),
        ): HttpResponseFor<CollectionResponsePipelineNoPaging> =
            list(objectType, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PipelineListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePipelineNoPaging>

        /** @see list */
        @MustBeClosed
        fun list(params: PipelineListParams): HttpResponseFor<CollectionResponsePipelineNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePipelineNoPaging> =
            list(objectType, PipelineListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}`, but is otherwise the same as
         * [PipelineService.delete].
         */
        @MustBeClosed
        fun delete(pipelineId: String, params: PipelineDeleteParams): HttpResponse =
            delete(pipelineId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            pipelineId: String,
            params: PipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: PipelineDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages`, but is otherwise the same as
         * [PipelineService.createStage].
         */
        @MustBeClosed
        fun createStage(
            pipelineId: String,
            params: PipelineCreateStageParams,
        ): HttpResponseFor<PipelineStage> = createStage(pipelineId, params, RequestOptions.none())

        /** @see createStage */
        @MustBeClosed
        fun createStage(
            pipelineId: String,
            params: PipelineCreateStageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage> =
            createStage(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see createStage */
        @MustBeClosed
        fun createStage(params: PipelineCreateStageParams): HttpResponseFor<PipelineStage> =
            createStage(params, RequestOptions.none())

        /** @see createStage */
        @MustBeClosed
        fun createStage(
            params: PipelineCreateStageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the
         * same as [PipelineService.deleteStage].
         */
        @MustBeClosed
        fun deleteStage(stageId: String, params: PipelineDeleteStageParams): HttpResponse =
            deleteStage(stageId, params, RequestOptions.none())

        /** @see deleteStage */
        @MustBeClosed
        fun deleteStage(
            stageId: String,
            params: PipelineDeleteStageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteStage(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see deleteStage */
        @MustBeClosed
        fun deleteStage(params: PipelineDeleteStageParams): HttpResponse =
            deleteStage(params, RequestOptions.none())

        /** @see deleteStage */
        @MustBeClosed
        fun deleteStage(
            params: PipelineDeleteStageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /crm/pipelines/2026-03/{objectType}/{pipelineId}`,
         * but is otherwise the same as [PipelineService.get].
         */
        @MustBeClosed
        fun get(pipelineId: String, params: PipelineGetParams): HttpResponseFor<Pipeline> =
            get(pipelineId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            pipelineId: String,
            params: PipelineGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline> =
            get(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: PipelineGetParams): HttpResponseFor<Pipeline> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PipelineGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline>

        /**
         * Returns a raw HTTP response for `get
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the
         * same as [PipelineService.getStage].
         */
        @MustBeClosed
        fun getStage(
            stageId: String,
            params: PipelineGetStageParams,
        ): HttpResponseFor<PipelineStage> = getStage(stageId, params, RequestOptions.none())

        /** @see getStage */
        @MustBeClosed
        fun getStage(
            stageId: String,
            params: PipelineGetStageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage> =
            getStage(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see getStage */
        @MustBeClosed
        fun getStage(params: PipelineGetStageParams): HttpResponseFor<PipelineStage> =
            getStage(params, RequestOptions.none())

        /** @see getStage */
        @MustBeClosed
        fun getStage(
            params: PipelineGetStageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage>

        /**
         * Returns a raw HTTP response for `get
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/audit`, but is otherwise the same as
         * [PipelineService.listAudit].
         */
        @MustBeClosed
        fun listAudit(
            pipelineId: String,
            params: PipelineListAuditParams,
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging> =
            listAudit(pipelineId, params, RequestOptions.none())

        /** @see listAudit */
        @MustBeClosed
        fun listAudit(
            pipelineId: String,
            params: PipelineListAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging> =
            listAudit(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see listAudit */
        @MustBeClosed
        fun listAudit(
            params: PipelineListAuditParams
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging> =
            listAudit(params, RequestOptions.none())

        /** @see listAudit */
        @MustBeClosed
        fun listAudit(
            params: PipelineListAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>

        /**
         * Returns a raw HTTP response for `get
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}/audit`, but is
         * otherwise the same as [PipelineService.listStageAudit].
         */
        @MustBeClosed
        fun listStageAudit(
            stageId: String,
            params: PipelineListStageAuditParams,
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging> =
            listStageAudit(stageId, params, RequestOptions.none())

        /** @see listStageAudit */
        @MustBeClosed
        fun listStageAudit(
            stageId: String,
            params: PipelineListStageAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging> =
            listStageAudit(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see listStageAudit */
        @MustBeClosed
        fun listStageAudit(
            params: PipelineListStageAuditParams
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging> =
            listStageAudit(params, RequestOptions.none())

        /** @see listStageAudit */
        @MustBeClosed
        fun listStageAudit(
            params: PipelineListStageAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>

        /**
         * Returns a raw HTTP response for `get
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages`, but is otherwise the same as
         * [PipelineService.listStages].
         */
        @MustBeClosed
        fun listStages(
            pipelineId: String,
            params: PipelineListStagesParams,
        ): HttpResponseFor<CollectionResponsePipelineStageNoPaging> =
            listStages(pipelineId, params, RequestOptions.none())

        /** @see listStages */
        @MustBeClosed
        fun listStages(
            pipelineId: String,
            params: PipelineListStagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePipelineStageNoPaging> =
            listStages(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see listStages */
        @MustBeClosed
        fun listStages(
            params: PipelineListStagesParams
        ): HttpResponseFor<CollectionResponsePipelineStageNoPaging> =
            listStages(params, RequestOptions.none())

        /** @see listStages */
        @MustBeClosed
        fun listStages(
            params: PipelineListStagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePipelineStageNoPaging>

        /**
         * Returns a raw HTTP response for `put /crm/pipelines/2026-03/{objectType}/{pipelineId}`,
         * but is otherwise the same as [PipelineService.updateAllProperties].
         */
        @MustBeClosed
        fun updateAllProperties(
            pipelineId: String,
            params: PipelineUpdateAllPropertiesParams,
        ): HttpResponseFor<Pipeline> =
            updateAllProperties(pipelineId, params, RequestOptions.none())

        /** @see updateAllProperties */
        @MustBeClosed
        fun updateAllProperties(
            pipelineId: String,
            params: PipelineUpdateAllPropertiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline> =
            updateAllProperties(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see updateAllProperties */
        @MustBeClosed
        fun updateAllProperties(
            params: PipelineUpdateAllPropertiesParams
        ): HttpResponseFor<Pipeline> = updateAllProperties(params, RequestOptions.none())

        /** @see updateAllProperties */
        @MustBeClosed
        fun updateAllProperties(
            params: PipelineUpdateAllPropertiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the
         * same as [PipelineService.updateStage].
         */
        @MustBeClosed
        fun updateStage(
            stageId: String,
            params: PipelineUpdateStageParams,
        ): HttpResponseFor<PipelineStage> = updateStage(stageId, params, RequestOptions.none())

        /** @see updateStage */
        @MustBeClosed
        fun updateStage(
            stageId: String,
            params: PipelineUpdateStageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage> =
            updateStage(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see updateStage */
        @MustBeClosed
        fun updateStage(params: PipelineUpdateStageParams): HttpResponseFor<PipelineStage> =
            updateStage(params, RequestOptions.none())

        /** @see updateStage */
        @MustBeClosed
        fun updateStage(
            params: PipelineUpdateStageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage>

        /**
         * Returns a raw HTTP response for `put
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the
         * same as [PipelineService.updateStageAllProperties].
         */
        @MustBeClosed
        fun updateStageAllProperties(
            stageId: String,
            params: PipelineUpdateStageAllPropertiesParams,
        ): HttpResponseFor<PipelineStage> =
            updateStageAllProperties(stageId, params, RequestOptions.none())

        /** @see updateStageAllProperties */
        @MustBeClosed
        fun updateStageAllProperties(
            stageId: String,
            params: PipelineUpdateStageAllPropertiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage> =
            updateStageAllProperties(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see updateStageAllProperties */
        @MustBeClosed
        fun updateStageAllProperties(
            params: PipelineUpdateStageAllPropertiesParams
        ): HttpResponseFor<PipelineStage> = updateStageAllProperties(params, RequestOptions.none())

        /** @see updateStageAllProperties */
        @MustBeClosed
        fun updateStageAllProperties(
            params: PipelineUpdateStageAllPropertiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage>
    }
}
