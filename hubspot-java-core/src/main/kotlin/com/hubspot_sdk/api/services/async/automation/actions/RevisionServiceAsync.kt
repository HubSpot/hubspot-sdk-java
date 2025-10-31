// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation.actions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.automation.actions.PublicActionRevision
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionGetParams
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionListPageAsync
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RevisionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RevisionServiceAsync

    /** Retrieve the versions of a definition by ID. */
    fun list(
        definitionId: String,
        params: RevisionListParams,
    ): CompletableFuture<RevisionListPageAsync> = list(definitionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        definitionId: String,
        params: RevisionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RevisionListPageAsync> =
        list(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see list */
    fun list(params: RevisionListParams): CompletableFuture<RevisionListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RevisionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RevisionListPageAsync>

    /** Retrieve a specific revision of a definition by revision ID. */
    fun get(
        revisionId: String,
        params: RevisionGetParams,
    ): CompletableFuture<PublicActionRevision> = get(revisionId, params, RequestOptions.none())

    /** @see get */
    fun get(
        revisionId: String,
        params: RevisionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionRevision> =
        get(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see get */
    fun get(params: RevisionGetParams): CompletableFuture<PublicActionRevision> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: RevisionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionRevision>

    /**
     * A view of [RevisionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RevisionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /automation/v4/actions/{appId}/{definitionId}/revisions`, but is otherwise the same as
         * [RevisionServiceAsync.list].
         */
        fun list(
            definitionId: String,
            params: RevisionListParams,
        ): CompletableFuture<HttpResponseFor<RevisionListPageAsync>> =
            list(definitionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            definitionId: String,
            params: RevisionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RevisionListPageAsync>> =
            list(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see list */
        fun list(
            params: RevisionListParams
        ): CompletableFuture<HttpResponseFor<RevisionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RevisionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RevisionListPageAsync>>

        /**
         * Returns a raw HTTP response for `get
         * /automation/v4/actions/{appId}/{definitionId}/revisions/{revisionId}`, but is otherwise
         * the same as [RevisionServiceAsync.get].
         */
        fun get(
            revisionId: String,
            params: RevisionGetParams,
        ): CompletableFuture<HttpResponseFor<PublicActionRevision>> =
            get(revisionId, params, RequestOptions.none())

        /** @see get */
        fun get(
            revisionId: String,
            params: RevisionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionRevision>> =
            get(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see get */
        fun get(
            params: RevisionGetParams
        ): CompletableFuture<HttpResponseFor<PublicActionRevision>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: RevisionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionRevision>>
    }
}
