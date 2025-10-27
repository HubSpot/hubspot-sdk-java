// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.pipelines.CollectionResponsePipelineNoPaging
import com.hubspot_sdk.api.models.crm.pipelines.CollectionResponsePublicAuditInfoNoPaging
import com.hubspot_sdk.api.models.crm.pipelines.Pipeline
import com.hubspot_sdk.api.models.crm.pipelines.PipelineCreateParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineDeleteParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetAuditParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineListParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineReplaceParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.pipelines.StageService
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

    fun stages(): StageService

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

    /** Delete the pipeline identified by `{pipelineId}`. */
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

    /**
     * Return a reverse chronological list of all mutations that have occurred on the pipeline
     * identified by `{pipelineId}`.
     */
    fun getAudit(
        pipelineId: String,
        params: PipelineGetAuditParams,
    ): CollectionResponsePublicAuditInfoNoPaging =
        getAudit(pipelineId, params, RequestOptions.none())

    /** @see getAudit */
    fun getAudit(
        pipelineId: String,
        params: PipelineGetAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAuditInfoNoPaging =
        getAudit(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see getAudit */
    fun getAudit(params: PipelineGetAuditParams): CollectionResponsePublicAuditInfoNoPaging =
        getAudit(params, RequestOptions.none())

    /** @see getAudit */
    fun getAudit(
        params: PipelineGetAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAuditInfoNoPaging

    /**
     * Replace all the properties of an existing pipeline with the values provided. This will
     * overwrite any existing pipeline stages. The updated pipeline will be returned in the
     * response.
     */
    fun replace(pipelineId: String, params: PipelineReplaceParams): Pipeline =
        replace(pipelineId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        pipelineId: String,
        params: PipelineReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline = replace(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see replace */
    fun replace(params: PipelineReplaceParams): Pipeline = replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: PipelineReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline

    /** A view of [PipelineService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PipelineService.WithRawResponse

        fun stages(): StageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/pipelines/{objectType}`, but is otherwise
         * the same as [PipelineService.create].
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
         * Returns a raw HTTP response for `patch /crm/v3/pipelines/{objectType}/{pipelineId}`, but
         * is otherwise the same as [PipelineService.update].
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
         * Returns a raw HTTP response for `get /crm/v3/pipelines/{objectType}`, but is otherwise
         * the same as [PipelineService.list].
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
         * Returns a raw HTTP response for `delete /crm/v3/pipelines/{objectType}/{pipelineId}`, but
         * is otherwise the same as [PipelineService.delete].
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
         * Returns a raw HTTP response for `get /crm/v3/pipelines/{objectType}/{pipelineId}`, but is
         * otherwise the same as [PipelineService.get].
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
         * Returns a raw HTTP response for `get /crm/v3/pipelines/{objectType}/{pipelineId}/audit`,
         * but is otherwise the same as [PipelineService.getAudit].
         */
        @MustBeClosed
        fun getAudit(
            pipelineId: String,
            params: PipelineGetAuditParams,
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging> =
            getAudit(pipelineId, params, RequestOptions.none())

        /** @see getAudit */
        @MustBeClosed
        fun getAudit(
            pipelineId: String,
            params: PipelineGetAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging> =
            getAudit(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see getAudit */
        @MustBeClosed
        fun getAudit(
            params: PipelineGetAuditParams
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging> =
            getAudit(params, RequestOptions.none())

        /** @see getAudit */
        @MustBeClosed
        fun getAudit(
            params: PipelineGetAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>

        /**
         * Returns a raw HTTP response for `put /crm/v3/pipelines/{objectType}/{pipelineId}`, but is
         * otherwise the same as [PipelineService.replace].
         */
        @MustBeClosed
        fun replace(pipelineId: String, params: PipelineReplaceParams): HttpResponseFor<Pipeline> =
            replace(pipelineId, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            pipelineId: String,
            params: PipelineReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline> =
            replace(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(params: PipelineReplaceParams): HttpResponseFor<Pipeline> =
            replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: PipelineReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline>
    }
}
