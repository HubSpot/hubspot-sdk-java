// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.hubdb

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCloneDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCreateParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowDeleteDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowListDraftPageAsync
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowListDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowListPageAsync
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowListParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowReplaceDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowUpdateDraftParams
import com.hubspot_sdk.api.services.async.cms.hubdb.rows.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Add a new row to a HubDB table. New rows will be added to the draft version of the table. Use
     * the `/publish` endpoint to push these changes to published version.
     */
    fun create(tableIdOrName: String, params: RowCreateParams): CompletableFuture<HubDbTableRowV3> =
        create(tableIdOrName, params, RequestOptions.none())

    /** @see create */
    fun create(
        tableIdOrName: String,
        params: RowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableRowV3> =
        create(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see create */
    fun create(params: RowCreateParams): CompletableFuture<HubDbTableRowV3> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableRowV3>

    /**
     * Returns a set of rows in the published version of the specified table. Row results can be
     * filtered and sorted. Filtering and sorting options will be sent as query parameters to the
     * API request. For example, by adding the query parameters `column1__gt=5&sort=-column1`, API
     * returns the rows with values for column `column1` greater than 5 and in the descending order
     * of `column1` values. Refer to the
     * [overview section](https://developers.hubspot.com/docs/api/cms/hubdb#filtering-and-sorting-table-rows)
     * for detailed filtering and sorting options. **Note:** This endpoint can be accessed without
     * any authentication, if the table is set to be allowed for public access.
     */
    fun list(tableIdOrName: String): CompletableFuture<RowListPageAsync> =
        list(tableIdOrName, RowListParams.none())

    /** @see list */
    fun list(
        tableIdOrName: String,
        params: RowListParams = RowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RowListPageAsync> =
        list(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see list */
    fun list(
        tableIdOrName: String,
        params: RowListParams = RowListParams.none(),
    ): CompletableFuture<RowListPageAsync> = list(tableIdOrName, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RowListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RowListPageAsync>

    /** @see list */
    fun list(params: RowListParams): CompletableFuture<RowListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        tableIdOrName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RowListPageAsync> =
        list(tableIdOrName, RowListParams.none(), requestOptions)

    /** Clones a single row in the draft version of a table. */
    fun cloneDraft(rowId: String, params: RowCloneDraftParams): CompletableFuture<HubDbTableRowV3> =
        cloneDraft(rowId, params, RequestOptions.none())

    /** @see cloneDraft */
    fun cloneDraft(
        rowId: String,
        params: RowCloneDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableRowV3> =
        cloneDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see cloneDraft */
    fun cloneDraft(params: RowCloneDraftParams): CompletableFuture<HubDbTableRowV3> =
        cloneDraft(params, RequestOptions.none())

    /** @see cloneDraft */
    fun cloneDraft(
        params: RowCloneDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableRowV3>

    /** Permanently deletes a row from a table's draft version. */
    fun deleteDraft(rowId: String, params: RowDeleteDraftParams): CompletableFuture<Void?> =
        deleteDraft(rowId, params, RequestOptions.none())

    /** @see deleteDraft */
    fun deleteDraft(
        rowId: String,
        params: RowDeleteDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see deleteDraft */
    fun deleteDraft(params: RowDeleteDraftParams): CompletableFuture<Void?> =
        deleteDraft(params, RequestOptions.none())

    /** @see deleteDraft */
    fun deleteDraft(
        params: RowDeleteDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Get a single row by ID from the published version of a table. **Note:** This endpoint can be
     * accessed without any authentication, if the table is set to be allowed for public access.
     */
    fun get(rowId: String, params: RowGetParams): CompletableFuture<HubDbTableRowV3> =
        get(rowId, params, RequestOptions.none())

    /** @see get */
    fun get(
        rowId: String,
        params: RowGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableRowV3> =
        get(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see get */
    fun get(params: RowGetParams): CompletableFuture<HubDbTableRowV3> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: RowGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableRowV3>

    /** Get a single row by ID from a table's draft version. */
    fun getDraft(rowId: String, params: RowGetDraftParams): CompletableFuture<HubDbTableRowV3> =
        getDraft(rowId, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        rowId: String,
        params: RowGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableRowV3> =
        getDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(params: RowGetDraftParams): CompletableFuture<HubDbTableRowV3> =
        getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: RowGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableRowV3>

    /**
     * Returns rows in the draft version of the specified table. Row results can be filtered and
     * sorted. Filtering and sorting options will be sent as query parameters to the API request.
     * For example, by adding the query parameters `column1__gt=5&sort=-column1`, API returns the
     * rows with values for column `column1` greater than 5 and in the descending order of `column1`
     * values. Refer to the
     * [overview section](https://developers.hubspot.com/docs/api/cms/hubdb#filtering-and-sorting-table-rows)
     * for detailed filtering and sorting options.
     */
    fun listDraft(tableIdOrName: String): CompletableFuture<RowListDraftPageAsync> =
        listDraft(tableIdOrName, RowListDraftParams.none())

    /** @see listDraft */
    fun listDraft(
        tableIdOrName: String,
        params: RowListDraftParams = RowListDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RowListDraftPageAsync> =
        listDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see listDraft */
    fun listDraft(
        tableIdOrName: String,
        params: RowListDraftParams = RowListDraftParams.none(),
    ): CompletableFuture<RowListDraftPageAsync> =
        listDraft(tableIdOrName, params, RequestOptions.none())

    /** @see listDraft */
    fun listDraft(
        params: RowListDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RowListDraftPageAsync>

    /** @see listDraft */
    fun listDraft(params: RowListDraftParams): CompletableFuture<RowListDraftPageAsync> =
        listDraft(params, RequestOptions.none())

    /** @see listDraft */
    fun listDraft(
        tableIdOrName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RowListDraftPageAsync> =
        listDraft(tableIdOrName, RowListDraftParams.none(), requestOptions)

    /**
     * Replace a single row in the draft version of a table. All column values must be specified. If
     * a column has a value in the target table and this request doesn't define that value, it will
     * be deleted. See the "Create a row" endpoint for instructions on how to format the JSON row
     * definitions.
     */
    fun replaceDraft(
        rowId: String,
        params: RowReplaceDraftParams,
    ): CompletableFuture<HubDbTableRowV3> = replaceDraft(rowId, params, RequestOptions.none())

    /** @see replaceDraft */
    fun replaceDraft(
        rowId: String,
        params: RowReplaceDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableRowV3> =
        replaceDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see replaceDraft */
    fun replaceDraft(params: RowReplaceDraftParams): CompletableFuture<HubDbTableRowV3> =
        replaceDraft(params, RequestOptions.none())

    /** @see replaceDraft */
    fun replaceDraft(
        params: RowReplaceDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableRowV3>

    /**
     * Sparse updates a single row in the table's draft version. All the column values need not be
     * specified. Only the columns or fields that needs to be modified can be specified. See the
     * "Create a row" endpoint for instructions on how to format the JSON row definitions.
     */
    fun updateDraft(
        rowId: String,
        params: RowUpdateDraftParams,
    ): CompletableFuture<HubDbTableRowV3> = updateDraft(rowId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        rowId: String,
        params: RowUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableRowV3> =
        updateDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: RowUpdateDraftParams): CompletableFuture<HubDbTableRowV3> =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: RowUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableRowV3>

    /** A view of [RowServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/v3/hubdb/tables/{tableIdOrName}/rows`, but is
         * otherwise the same as [RowServiceAsync.create].
         */
        fun create(
            tableIdOrName: String,
            params: RowCreateParams,
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            create(tableIdOrName, params, RequestOptions.none())

        /** @see create */
        fun create(
            tableIdOrName: String,
            params: RowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            create(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see create */
        fun create(params: RowCreateParams): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>>

        /**
         * Returns a raw HTTP response for `get /cms/v3/hubdb/tables/{tableIdOrName}/rows`, but is
         * otherwise the same as [RowServiceAsync.list].
         */
        fun list(tableIdOrName: String): CompletableFuture<HttpResponseFor<RowListPageAsync>> =
            list(tableIdOrName, RowListParams.none())

        /** @see list */
        fun list(
            tableIdOrName: String,
            params: RowListParams = RowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RowListPageAsync>> =
            list(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see list */
        fun list(
            tableIdOrName: String,
            params: RowListParams = RowListParams.none(),
        ): CompletableFuture<HttpResponseFor<RowListPageAsync>> =
            list(tableIdOrName, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RowListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RowListPageAsync>>

        /** @see list */
        fun list(params: RowListParams): CompletableFuture<HttpResponseFor<RowListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RowListPageAsync>> =
            list(tableIdOrName, RowListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}/draft/clone`, but is otherwise the same
         * as [RowServiceAsync.cloneDraft].
         */
        fun cloneDraft(
            rowId: String,
            params: RowCloneDraftParams,
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            cloneDraft(rowId, params, RequestOptions.none())

        /** @see cloneDraft */
        fun cloneDraft(
            rowId: String,
            params: RowCloneDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            cloneDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see cloneDraft */
        fun cloneDraft(
            params: RowCloneDraftParams
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            cloneDraft(params, RequestOptions.none())

        /** @see cloneDraft */
        fun cloneDraft(
            params: RowCloneDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>>

        /**
         * Returns a raw HTTP response for `delete
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}/draft`, but is otherwise the same as
         * [RowServiceAsync.deleteDraft].
         */
        fun deleteDraft(
            rowId: String,
            params: RowDeleteDraftParams,
        ): CompletableFuture<HttpResponse> = deleteDraft(rowId, params, RequestOptions.none())

        /** @see deleteDraft */
        fun deleteDraft(
            rowId: String,
            params: RowDeleteDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see deleteDraft */
        fun deleteDraft(params: RowDeleteDraftParams): CompletableFuture<HttpResponse> =
            deleteDraft(params, RequestOptions.none())

        /** @see deleteDraft */
        fun deleteDraft(
            params: RowDeleteDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}`,
         * but is otherwise the same as [RowServiceAsync.get].
         */
        fun get(
            rowId: String,
            params: RowGetParams,
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            get(rowId, params, RequestOptions.none())

        /** @see get */
        fun get(
            rowId: String,
            params: RowGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            get(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see get */
        fun get(params: RowGetParams): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: RowGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>>

        /**
         * Returns a raw HTTP response for `get
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}/draft`, but is otherwise the same as
         * [RowServiceAsync.getDraft].
         */
        fun getDraft(
            rowId: String,
            params: RowGetDraftParams,
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            getDraft(rowId, params, RequestOptions.none())

        /** @see getDraft */
        fun getDraft(
            rowId: String,
            params: RowGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            getDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see getDraft */
        fun getDraft(
            params: RowGetDraftParams
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        fun getDraft(
            params: RowGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>>

        /**
         * Returns a raw HTTP response for `get /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft`,
         * but is otherwise the same as [RowServiceAsync.listDraft].
         */
        fun listDraft(
            tableIdOrName: String
        ): CompletableFuture<HttpResponseFor<RowListDraftPageAsync>> =
            listDraft(tableIdOrName, RowListDraftParams.none())

        /** @see listDraft */
        fun listDraft(
            tableIdOrName: String,
            params: RowListDraftParams = RowListDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RowListDraftPageAsync>> =
            listDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see listDraft */
        fun listDraft(
            tableIdOrName: String,
            params: RowListDraftParams = RowListDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<RowListDraftPageAsync>> =
            listDraft(tableIdOrName, params, RequestOptions.none())

        /** @see listDraft */
        fun listDraft(
            params: RowListDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RowListDraftPageAsync>>

        /** @see listDraft */
        fun listDraft(
            params: RowListDraftParams
        ): CompletableFuture<HttpResponseFor<RowListDraftPageAsync>> =
            listDraft(params, RequestOptions.none())

        /** @see listDraft */
        fun listDraft(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RowListDraftPageAsync>> =
            listDraft(tableIdOrName, RowListDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}/draft`, but is otherwise the same as
         * [RowServiceAsync.replaceDraft].
         */
        fun replaceDraft(
            rowId: String,
            params: RowReplaceDraftParams,
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            replaceDraft(rowId, params, RequestOptions.none())

        /** @see replaceDraft */
        fun replaceDraft(
            rowId: String,
            params: RowReplaceDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            replaceDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see replaceDraft */
        fun replaceDraft(
            params: RowReplaceDraftParams
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            replaceDraft(params, RequestOptions.none())

        /** @see replaceDraft */
        fun replaceDraft(
            params: RowReplaceDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>>

        /**
         * Returns a raw HTTP response for `patch
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}/draft`, but is otherwise the same as
         * [RowServiceAsync.updateDraft].
         */
        fun updateDraft(
            rowId: String,
            params: RowUpdateDraftParams,
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            updateDraft(rowId, params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            rowId: String,
            params: RowUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            updateDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see updateDraft */
        fun updateDraft(
            params: RowUpdateDraftParams
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            params: RowUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>>
    }
}
