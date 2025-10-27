// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.hubdb.rows

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.hubdb.BatchResponseHubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchCloneBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchCreateBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchGetBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchGetDraftBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchPurgeBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchReplaceBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchUpdateBatchParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync

    /**
     * Clones rows in the draft version of the specified table, given a set of row ids. Maximum of
     * 100 row ids per call.
     */
    fun cloneBatch(
        tableIdOrName: String,
        params: BatchCloneBatchParams,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        cloneBatch(tableIdOrName, params, RequestOptions.none())

    /** @see cloneBatch */
    fun cloneBatch(
        tableIdOrName: String,
        params: BatchCloneBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        cloneBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see cloneBatch */
    fun cloneBatch(params: BatchCloneBatchParams): CompletableFuture<BatchResponseHubDbTableRowV3> =
        cloneBatch(params, RequestOptions.none())

    /** @see cloneBatch */
    fun cloneBatch(
        params: BatchCloneBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseHubDbTableRowV3>

    /**
     * Creates rows in the draft version of the specified table, given an array of row objects.
     * Maximum of 100 row object per call. See the overview section for more details with an
     * example.
     */
    fun createBatch(
        tableIdOrName: String,
        params: BatchCreateBatchParams,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        createBatch(tableIdOrName, params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        tableIdOrName: String,
        params: BatchCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        createBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see createBatch */
    fun createBatch(
        params: BatchCreateBatchParams
    ): CompletableFuture<BatchResponseHubDbTableRowV3> = createBatch(params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        params: BatchCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseHubDbTableRowV3>

    /**
     * Returns rows in the published version of the specified table, given a set of row IDs.
     * **Note:** This endpoint can be accessed without any authentication if the table is set to be
     * allowed for public access.
     */
    fun getBatch(
        tableIdOrName: String,
        params: BatchGetBatchParams,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        getBatch(tableIdOrName, params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        tableIdOrName: String,
        params: BatchGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        getBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see getBatch */
    fun getBatch(params: BatchGetBatchParams): CompletableFuture<BatchResponseHubDbTableRowV3> =
        getBatch(params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        params: BatchGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseHubDbTableRowV3>

    /** Returns rows in the draft version of the specified table, given a set of row IDs. */
    fun getDraftBatch(
        tableIdOrName: String,
        params: BatchGetDraftBatchParams,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        getDraftBatch(tableIdOrName, params, RequestOptions.none())

    /** @see getDraftBatch */
    fun getDraftBatch(
        tableIdOrName: String,
        params: BatchGetDraftBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        getDraftBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see getDraftBatch */
    fun getDraftBatch(
        params: BatchGetDraftBatchParams
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        getDraftBatch(params, RequestOptions.none())

    /** @see getDraftBatch */
    fun getDraftBatch(
        params: BatchGetDraftBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseHubDbTableRowV3>

    /**
     * Permanently deletes rows from the draft version of the table, given a set of row IDs. Maximum
     * of 100 row IDs per call.
     */
    fun purgeBatch(tableIdOrName: String, params: BatchPurgeBatchParams): CompletableFuture<Void?> =
        purgeBatch(tableIdOrName, params, RequestOptions.none())

    /** @see purgeBatch */
    fun purgeBatch(
        tableIdOrName: String,
        params: BatchPurgeBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        purgeBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see purgeBatch */
    fun purgeBatch(params: BatchPurgeBatchParams): CompletableFuture<Void?> =
        purgeBatch(params, RequestOptions.none())

    /** @see purgeBatch */
    fun purgeBatch(
        params: BatchPurgeBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Replaces multiple rows as a batch in the draft version of the table, with a maximum of 100
     * rows per call. See the endpoint `PUT /tables/{tableIdOrName}/rows/{rowId}/draft` for details
     * on updating a single row.
     */
    fun replaceBatch(
        tableIdOrName: String,
        params: BatchReplaceBatchParams,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        replaceBatch(tableIdOrName, params, RequestOptions.none())

    /** @see replaceBatch */
    fun replaceBatch(
        tableIdOrName: String,
        params: BatchReplaceBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        replaceBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see replaceBatch */
    fun replaceBatch(
        params: BatchReplaceBatchParams
    ): CompletableFuture<BatchResponseHubDbTableRowV3> = replaceBatch(params, RequestOptions.none())

    /** @see replaceBatch */
    fun replaceBatch(
        params: BatchReplaceBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseHubDbTableRowV3>

    /**
     * Updates multiple rows as a batch in the draft version of the table, with a maximum of 100
     * rows per call. See the endpoint `PATCH /tables/{tableIdOrName}/rows/{rowId}/draft` for
     * details on updating a single row.
     */
    fun updateBatch(
        tableIdOrName: String,
        params: BatchUpdateBatchParams,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        updateBatch(tableIdOrName, params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        tableIdOrName: String,
        params: BatchUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        updateBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see updateBatch */
    fun updateBatch(
        params: BatchUpdateBatchParams
    ): CompletableFuture<BatchResponseHubDbTableRowV3> = updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: BatchUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseHubDbTableRowV3>

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/clone`, but is otherwise the same
         * as [BatchServiceAsync.cloneBatch].
         */
        fun cloneBatch(
            tableIdOrName: String,
            params: BatchCloneBatchParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            cloneBatch(tableIdOrName, params, RequestOptions.none())

        /** @see cloneBatch */
        fun cloneBatch(
            tableIdOrName: String,
            params: BatchCloneBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            cloneBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see cloneBatch */
        fun cloneBatch(
            params: BatchCloneBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            cloneBatch(params, RequestOptions.none())

        /** @see cloneBatch */
        fun cloneBatch(
            params: BatchCloneBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/create`, but is otherwise the same
         * as [BatchServiceAsync.createBatch].
         */
        fun createBatch(
            tableIdOrName: String,
            params: BatchCreateBatchParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            createBatch(tableIdOrName, params, RequestOptions.none())

        /** @see createBatch */
        fun createBatch(
            tableIdOrName: String,
            params: BatchCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            createBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see createBatch */
        fun createBatch(
            params: BatchCreateBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            createBatch(params, RequestOptions.none())

        /** @see createBatch */
        fun createBatch(
            params: BatchCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/batch/read`, but is otherwise the same as
         * [BatchServiceAsync.getBatch].
         */
        fun getBatch(
            tableIdOrName: String,
            params: BatchGetBatchParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            getBatch(tableIdOrName, params, RequestOptions.none())

        /** @see getBatch */
        fun getBatch(
            tableIdOrName: String,
            params: BatchGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            getBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see getBatch */
        fun getBatch(
            params: BatchGetBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            getBatch(params, RequestOptions.none())

        /** @see getBatch */
        fun getBatch(
            params: BatchGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/read`, but is otherwise the same as
         * [BatchServiceAsync.getDraftBatch].
         */
        fun getDraftBatch(
            tableIdOrName: String,
            params: BatchGetDraftBatchParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            getDraftBatch(tableIdOrName, params, RequestOptions.none())

        /** @see getDraftBatch */
        fun getDraftBatch(
            tableIdOrName: String,
            params: BatchGetDraftBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            getDraftBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see getDraftBatch */
        fun getDraftBatch(
            params: BatchGetDraftBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            getDraftBatch(params, RequestOptions.none())

        /** @see getDraftBatch */
        fun getDraftBatch(
            params: BatchGetDraftBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/purge`, but is otherwise the same
         * as [BatchServiceAsync.purgeBatch].
         */
        fun purgeBatch(
            tableIdOrName: String,
            params: BatchPurgeBatchParams,
        ): CompletableFuture<HttpResponse> =
            purgeBatch(tableIdOrName, params, RequestOptions.none())

        /** @see purgeBatch */
        fun purgeBatch(
            tableIdOrName: String,
            params: BatchPurgeBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            purgeBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see purgeBatch */
        fun purgeBatch(params: BatchPurgeBatchParams): CompletableFuture<HttpResponse> =
            purgeBatch(params, RequestOptions.none())

        /** @see purgeBatch */
        fun purgeBatch(
            params: BatchPurgeBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/replace`, but is otherwise the same
         * as [BatchServiceAsync.replaceBatch].
         */
        fun replaceBatch(
            tableIdOrName: String,
            params: BatchReplaceBatchParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            replaceBatch(tableIdOrName, params, RequestOptions.none())

        /** @see replaceBatch */
        fun replaceBatch(
            tableIdOrName: String,
            params: BatchReplaceBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            replaceBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see replaceBatch */
        fun replaceBatch(
            params: BatchReplaceBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            replaceBatch(params, RequestOptions.none())

        /** @see replaceBatch */
        fun replaceBatch(
            params: BatchReplaceBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/update`, but is otherwise the same
         * as [BatchServiceAsync.updateBatch].
         */
        fun updateBatch(
            tableIdOrName: String,
            params: BatchUpdateBatchParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            updateBatch(tableIdOrName, params, RequestOptions.none())

        /** @see updateBatch */
        fun updateBatch(
            tableIdOrName: String,
            params: BatchUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            updateBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see updateBatch */
        fun updateBatch(
            params: BatchUpdateBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        fun updateBatch(
            params: BatchUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>>
    }
}
