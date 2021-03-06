package com.example.widget

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews

/**
 * Implementation of App Widget functionality.
 */
class uno : AppWidgetProvider() {
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        // There may be multiple widgets active, so update all of them
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    override fun onEnabled(context: Context) {
        // Enter relevant functionality for when the first widget is created
    }

    override fun onDisabled(context: Context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}

internal fun updateAppWidget(
    context: Context,
    appWidgetManager: AppWidgetManager,
    appWidgetId: Int
) {
    val i1 : PendingIntent = Intent(context, CanvaUGB::class.java).let { intent ->
        PendingIntent.getActivities(context,0, arrayOf(intent),0)
    }
    val i2 : PendingIntent = Intent(context, PortalUGB::class.java).let { intent ->
        PendingIntent.getActivities(context,0, arrayOf(intent),0)
    }
    val views = RemoteViews(context.packageName, R.layout.uno)
        .apply{setOnClickPendingIntent(R.id.Canva,i1)}
        .apply{setOnClickPendingIntent(R.id.Portal,i2)}

    // Instruct the widget manager to update the widget
    appWidgetManager.updateAppWidget(appWidgetId, views)
}